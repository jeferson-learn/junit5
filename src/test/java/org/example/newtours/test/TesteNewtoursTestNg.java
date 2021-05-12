package org.example.newtours.test;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.newtours.actions.NewtoursFlightsActions;
import org.example.newtours.actions.NewtoursHomeActions;
import org.example.newtours.actions.NewtoursRegisterActions;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TesteNewtoursTestNg {

    private WebDriver driver;
    private static NewtoursHomeActions homeActions;
    private static NewtoursRegisterActions registerActions;
    private static NewtoursFlightsActions flightsActions;

    @BeforeMethod
    public void abrirNewtours() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/newtours/");

        // instancias de actions
        homeActions = new NewtoursHomeActions(driver);
        registerActions = new NewtoursRegisterActions(driver);
        flightsActions = new NewtoursFlightsActions(driver);
    }

    @Test
    public void login() {
        homeActions.login();
    }

    @Test
    public void register() {
        Assertions.assertEquals("http://demo.guru99.com/test/newtours/", driver.getCurrentUrl());

        homeActions.abaRegister();

        Assertions.assertEquals("http://demo.guru99.com/test/newtours/register.php", driver.getCurrentUrl());

        registerActions.feitoRegister();

        Assertions.assertTrue(driver.getCurrentUrl().contains("register_sucess"), "O registro não foi sucesso");

    }

    @Test
    public void procurar() {
        homeActions.menuFlights();
        flightsActions.procurarVoo();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

}
