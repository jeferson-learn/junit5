package org.example.junit5.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
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

    @FindBy(linkText = "Criar nova conta")
    private WebElement butCriarNovaConta;

    @FindBy(name = "firstname")
    private WebElement inputNome;

    @FindBy(name = "lastname")
    private WebElement inputSobrenome;

    @FindBys({
            @FindBy(css = "div.mbm"),
            @FindBy(css = "div._5dbb"),
            @FindBy(name = "firstname")
    })
    private WebElement listaElementoNome;

    @FindBys({
            @FindBy(css = "div.mbm"),
            @FindBy(css = "div._5dbb"),
            @FindBy(css = "uiStickyPlaceholderInput"),
            @FindBy(name = "lastname")
    })
    private WebElement listaElementoSobrenome;

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

    public WebElement getButCriarNovaConta() {
        return butCriarNovaConta;
    }

    public void setButCriarNovaConta(WebElement butCriarNovaConta) {
        this.butCriarNovaConta = butCriarNovaConta;
    }

    public WebElement getInputNome() {
        return inputNome;
    }

    public void setInputNome(WebElement inputNome) {
        this.inputNome = inputNome;
    }

    public WebElement getInputSobrenome() {
        return inputSobrenome;
    }

    public void setInputSobrenome(WebElement inputSobrenome) {
        this.inputSobrenome = inputSobrenome;
    }

    public WebElement getListaElementoNome() {
        return listaElementoNome;
    }

    public void setListaElementoNome(WebElement listaElementoNome) {
        this.listaElementoNome = listaElementoNome;
    }

    public WebElement getListaElementoSobrenome() {
        return listaElementoSobrenome;
    }

    public void setListaElementoSobrenome(WebElement listaElementoSobrenome) {
        this.listaElementoSobrenome = listaElementoSobrenome;
    }
}
