package org.example.junit5.actions;

import org.example.junit5.pageobjects.RecuperarContaObjects;
import org.openqa.selenium.WebDriver;

public class RecuperarSenhaActions {

    private RecuperarContaObjects recuperarContaObjects;

    public RecuperarSenhaActions(WebDriver driver) {
        recuperarContaObjects = new RecuperarContaObjects(driver);
    }

    public void recuperarSenha(String email){
        recuperarContaObjects.getInputRecuperarEmail().sendKeys(email);
        recuperarContaObjects.getButRecuperarEmail().click();
    }
}
