package org.example.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeObjects {

    private WebDriver driver;

    @FindBy(id = "email")
    private WebElement inputEmail;

    @FindBy(name = "pass")
    private WebElement inputSenha;

    @FindBy(name = "login")
    private WebElement butLogin;

    @FindBy(linkText = "Esqueceu a senha?")
    private WebElement butEsquecerSenha;

    public HomeObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(WebElement inputEmail) {
        this.inputEmail = inputEmail;
    }

    public WebElement getInputSenha() {
        return inputSenha;
    }

    public void setInputSenha(WebElement inputSenha) {
        this.inputSenha = inputSenha;
    }

    public WebElement getButLogin() {
        return butLogin;
    }

    public void setButLogin(WebElement butLogin) {
        this.butLogin = butLogin;
    }

    public WebElement getButEsquecerSenha() {
        return butEsquecerSenha;
    }

    public void setButEsquecerSenha(WebElement butEsquecerSenha) {
        this.butEsquecerSenha = butEsquecerSenha;
    }
}
