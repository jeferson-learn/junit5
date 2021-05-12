package org.example.newtours.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewtoursHomeObjects {

    private WebDriver driver;

    @FindBy(linkText = "REGISTER")
    private WebElement linkRegister;
    @FindBy(name = "userName")
    private WebElement inputName;
    @FindBy(name = "password")
    private WebElement inputPassword;
    @FindBy(name = "submit")
    private WebElement butSubmit;
    @FindBy(linkText = "Home")
    private WebElement linkHome;
    @FindBy(linkText = "Flights")
    private WebElement linkFlights;
    @FindBy(linkText = "Hotels")
    private WebElement linkHotels;
    @FindBy(linkText = "Car Rentals")
    private WebElement linkCarRentals;
    @FindBy(linkText = "Cruises")
    private WebElement linkCruises;
    @FindBy(linkText = "Destinations")
    private WebElement linkDestinations;
    @FindBy(linkText = "Vacations")
    private WebElement linkVacations;


    public NewtoursHomeObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getLinkRegister() {
        return linkRegister;
    }

    public void setLinkRegister(WebElement linkRegister) {
        this.linkRegister = linkRegister;
    }

    public WebElement getInputName() {
        return inputName;
    }

    public void setInputName(WebElement inputName) {
        this.inputName = inputName;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(WebElement inputPassword) {
        this.inputPassword = inputPassword;
    }

    public WebElement getButSubmit() {
        return butSubmit;
    }

    public void setButSubmit(WebElement butSubmit) {
        this.butSubmit = butSubmit;
    }

    public WebElement getLinkHome() {
        return linkHome;
    }

    public void setLinkHome(WebElement linkHome) {
        this.linkHome = linkHome;
    }

    public WebElement getLinkFlights() {
        return linkFlights;
    }

    public void setLinkFlights(WebElement linkFlights) {
        this.linkFlights = linkFlights;
    }

    public WebElement getLinkHotels() {
        return linkHotels;
    }

    public void setLinkHotels(WebElement linkHotels) {
        this.linkHotels = linkHotels;
    }

    public WebElement getLinkCarRentals() {
        return linkCarRentals;
    }

    public void setLinkCarRentals(WebElement linkCarRentals) {
        this.linkCarRentals = linkCarRentals;
    }

    public WebElement getLinkCruises() {
        return linkCruises;
    }

    public void setLinkCruises(WebElement linkCruises) {
        this.linkCruises = linkCruises;
    }

    public WebElement getLinkDestinations() {
        return linkDestinations;
    }

    public void setLinkDestinations(WebElement linkDestinations) {
        this.linkDestinations = linkDestinations;
    }

    public WebElement getLinkVacations() {
        return linkVacations;
    }

    public void setLinkVacations(WebElement linkVacations) {
        this.linkVacations = linkVacations;
    }
}
