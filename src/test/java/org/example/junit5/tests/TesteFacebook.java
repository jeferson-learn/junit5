package org.example.junit5.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.junit5.actions.HomeActions;
import org.example.junit5.actions.RecuperarSenhaActions;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteFacebook {

    private static WebDriver driver;
    private static HomeActions homeActions;
    private static RecuperarSenhaActions recuperarSenhaActions;

//    @BeforeAll
    public void iniciarTeste() {
        System.out.println("Foram iniciados os testes com Before All");
    }

    @BeforeEach
    public void abrirFacebook() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.facebook.com");

        // instancias de actions
        homeActions = new HomeActions(driver);
        recuperarSenhaActions = new RecuperarSenhaActions(driver);
    }

    @Test
    @Tag("credenciais")
    public void logarFacebook() {
        Assertions.assertEquals("https://www.facebook.com/", driver.getCurrentUrl());
        homeActions.login();
    }

//    @Disabled("O teste de criar conta foi desabilitado")
    @Tag("credenciais")
    @Test
    public void criarConta() {

    }

    @ParameterizedTest
    @ValueSource(strings = {"jeferson@jeferson.com","lopes@lopes.com", "eugenio@eugenio.com"})
    @Tag("recuperação")
    public void recuperarSenha(String email) {
        homeActions.recuperarSenha();

        Assertions.assertTrue(driver.getTitle().contains("Esqueci a senha"), "Não contem as palavras no titulo");

        recuperarSenhaActions.recuperarSenha(email);
    }

    @AfterEach
    public void fecharJanela() {
        driver.quit();
    }

//    @AfterAll
    public void finalizarTeste() {
        System.out.println("Os testes foram finalizados com After All");
    }
}
