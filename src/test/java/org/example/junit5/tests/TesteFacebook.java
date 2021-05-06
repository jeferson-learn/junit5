package org.example.junit5.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.junit5.actions.HomeActions;
import org.example.junit5.actions.RecuperarSenhaActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteFacebook {

    private static WebDriver driver;
    private static HomeActions homeActions;
    private static RecuperarSenhaActions recuperarSenhaActions;

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
    public void logarFacebook() {
        homeActions.login();
    }

    @Test
    public void criarConta() {

    }

    @Test
    public void recuperarSenha() {
        homeActions.recuperarSenha();
        recuperarSenhaActions.recuperarSenha();
    }

    @AfterEach
    public void fecharJanela() {
        driver.quit();
    }
}
