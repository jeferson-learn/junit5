package org.example.junit5.actions;

import org.example.junit5.pageobjects.GoogleObjects;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class GoogleActions {

    private GoogleObjects googleObjects;

    public GoogleActions(WebDriver driver) {
        googleObjects = new GoogleObjects(driver);
    }

    public void pesquisar(String pesquisar) {
        googleObjects.getInputPesquisar().sendKeys(pesquisar + Keys.ENTER);
    }
}
