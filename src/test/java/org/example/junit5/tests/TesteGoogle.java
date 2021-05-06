package org.example.junit5.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.junit5.actions.GoogleActions;
import org.example.junit5.actions.HomeActions;
import org.example.junit5.actions.RecuperarSenhaActions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {

    private static WebDriver driver;
    private static GoogleActions googleActions;

    @BeforeEach
    public void abrirFacebook() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");

        // instancias de actions
        googleActions = new GoogleActions(driver);
    }

    @Test
    public void googlePesquisar() {
        googleActions.pesquisar("Internacional");
    }

    @AfterEach
    public void fechaJanela() {
        driver.quit();
    }
}
