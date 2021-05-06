package org.example.junit5.actions;

import org.example.junit5.pageobjects.HomeObjects;
import org.openqa.selenium.WebDriver;

public class HomeActions {

    private HomeObjects homeObjects;

    public HomeActions (WebDriver driver) {
        homeObjects = new HomeObjects(driver);
    }

    public void login() {
        homeObjects.getInputEmail().sendKeys("email@email.com");
        homeObjects.getInputSenha().sendKeys("123456789");
        homeObjects.getButLogin().click();
    }

    public void recuperarSenha() {
        homeObjects.getButEsquecerSenha().click();
    }
}
