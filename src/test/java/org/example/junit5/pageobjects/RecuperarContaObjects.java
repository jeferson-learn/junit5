package org.example.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecuperarContaObjects {

    private WebDriver driver;

    @FindBy(id = "identify_email")
    private WebElement inputRecuperarEmail;

    @FindBy(id = "did_submit")
    private WebElement butRecuperarEmail;

    public RecuperarContaObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputRecuperarEmail() {
        return inputRecuperarEmail;
    }

    public void setInputRecuperarEmail(WebElement inputRecuperarEmail) {
        this.inputRecuperarEmail = inputRecuperarEmail;
    }

    public WebElement getButRecuperarEmail() {
        return butRecuperarEmail;
    }

    public void setButRecuperarEmail(WebElement butRecuperarEmail) {
        this.butRecuperarEmail = butRecuperarEmail;
    }
}
