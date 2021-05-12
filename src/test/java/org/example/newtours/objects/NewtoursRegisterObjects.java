package org.example.newtours.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewtoursRegisterObjects {

    private WebDriver driver;

    @FindBy(linkText = "Flights")
    private WebElement linkFlights;

    @FindBy(name = "firstName")
    private WebElement inputFirstName;
    @FindBy(name = "lastName")
    private WebElement inputLastName;
    @FindBy(name = "phone")
    private WebElement inputPhone;
    @FindBy(name = "userName")
    private WebElement inputEmail;
    @FindBy(name = "address1")
    private WebElement inputAddress;
    @FindBy(name = "city")
    private WebElement inputCity;
    @FindBy(name = "state")
    private WebElement inputState;
    @FindBy(name = "postalCode")
    private WebElement inputCode;
    @FindBy(name = "country")
    private WebElement selectCountry;
    @FindBy(name = "email")
    private WebElement inputUserName;
    @FindBy(name = "password")
    private WebElement inputPassword;
    @FindBy(name = "confirmPassword")
    private WebElement inputConfirmPassword;
    @FindBy(name = "submit")
    private WebElement butEnviar;

    public NewtoursRegisterObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLinkFlights() {
        return linkFlights;
    }

    public void setLinkFlights(WebElement linkFlights) {
        this.linkFlights = linkFlights;
    }

    public WebElement getInputFirstName() {
        return inputFirstName;
    }

    public void setInputFirstName(WebElement inputFirstName) {
        this.inputFirstName = inputFirstName;
    }

    public WebElement getInputLastName() {
        return inputLastName;
    }

    public void setInputLastName(WebElement inputLastName) {
        this.inputLastName = inputLastName;
    }

    public WebElement getInputPhone() {
        return inputPhone;
    }

    public void setInputPhone(WebElement inputPhone) {
        this.inputPhone = inputPhone;
    }

    public WebElement getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(WebElement inputEmail) {
        this.inputEmail = inputEmail;
    }

    public WebElement getInputAddress() {
        return inputAddress;
    }

    public void setInputAddress(WebElement inputAddress) {
        this.inputAddress = inputAddress;
    }

    public WebElement getInputCity() {
        return inputCity;
    }

    public void setInputCity(WebElement inputCity) {
        this.inputCity = inputCity;
    }

    public WebElement getInputState() {
        return inputState;
    }

    public void setInputState(WebElement inputState) {
        this.inputState = inputState;
    }

    public WebElement getInputCode() {
        return inputCode;
    }

    public void setInputCode(WebElement inputCode) {
        this.inputCode = inputCode;
    }

    public WebElement getSelectCountry() {
        return selectCountry;
    }

    public void setSelectCountry(WebElement selectCountry) {
        this.selectCountry = selectCountry;
    }

    public WebElement getInputUserName() {
        return inputUserName;
    }

    public void setInputUserName(WebElement inputUserName) {
        this.inputUserName = inputUserName;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(WebElement inputPassword) {
        this.inputPassword = inputPassword;
    }

    public WebElement getInputConfirmPassword() {
        return inputConfirmPassword;
    }

    public void setInputConfirmPassword(WebElement inputConfirmPassword) {
        this.inputConfirmPassword = inputConfirmPassword;
    }

    public WebElement getButEnviar() {
        return butEnviar;
    }

    public void setButEnviar(WebElement butEnviar) {
        this.butEnviar = butEnviar;
    }
}
