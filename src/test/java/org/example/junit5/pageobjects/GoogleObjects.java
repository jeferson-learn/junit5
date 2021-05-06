package org.example.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleObjects {
    private WebDriver driver;

    @FindBy(name = "q")
    private WebElement inputPesquisar;

    public GoogleObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputPesquisar() {
        return inputPesquisar;
    }

    public void setInputPesquisar(WebElement inputPesquisar) {
        this.inputPesquisar = inputPesquisar;
    }
}
