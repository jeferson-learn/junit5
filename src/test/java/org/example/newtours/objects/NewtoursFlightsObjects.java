package org.example.newtours.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewtoursFlightsObjects {

    private WebDriver driver;

    @FindBy(css = "input[value='oneway']")
    private WebElement radioOneWay;
    @FindBy(name = "passCount")
    private WebElement selectPassengers;
    @FindBy(name = "fromPort")
    private WebElement selectDepartingFrom;
    @FindBy(name = "fromMonth")
    private WebElement selectOnMonth;
    @FindBy(name = "fromDay")
    private WebElement selectOnDay;
    @FindBy(name = "toPort")
    private WebElement selectArrivingIn;
    @FindBy(name = "toMonth")
    private WebElement selectReturningMonth;
    @FindBy(name = "toDay")
    private WebElement selectReturningDay;
    @FindBy(css = "input[value='First']")
    private WebElement radioFirstClass;
    @FindBy(name = "airline")
    private WebElement selectAirline;
    @FindBy(name = "findFlights")
    private WebElement butContinue;

    public NewtoursFlightsObjects(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement getRadioOneWay() {
        return radioOneWay;
    }

    public void setRadioOneWay(WebElement radioOneWay) {
        this.radioOneWay = radioOneWay;
    }

    public WebElement getSelectPassengers() {
        return selectPassengers;
    }

    public void setSelectPassengers(WebElement selectPassengers) {
        this.selectPassengers = selectPassengers;
    }

    public WebElement getSelectDepartingFrom() {
        return selectDepartingFrom;
    }

    public void setSelectDepartingFrom(WebElement selectDepartingFrom) {
        this.selectDepartingFrom = selectDepartingFrom;
    }

    public WebElement getSelectOnMonth() {
        return selectOnMonth;
    }

    public void setSelectOnMonth(WebElement selectOnMonth) {
        this.selectOnMonth = selectOnMonth;
    }

    public WebElement getSelectOnDay() {
        return selectOnDay;
    }

    public void setSelectOnDay(WebElement selectOnDay) {
        this.selectOnDay = selectOnDay;
    }

    public WebElement getSelectArrivingIn() {
        return selectArrivingIn;
    }

    public void setSelectArrivingIn(WebElement selectArrivingIn) {
        this.selectArrivingIn = selectArrivingIn;
    }

    public WebElement getSelectReturningMonth() {
        return selectReturningMonth;
    }

    public void setSelectReturningMonth(WebElement selectReturningMonth) {
        this.selectReturningMonth = selectReturningMonth;
    }

    public WebElement getSelectReturningDay() {
        return selectReturningDay;
    }

    public void setSelectReturningDay(WebElement selectReturningDay) {
        this.selectReturningDay = selectReturningDay;
    }

    public WebElement getRadioFirstClass() {
        return radioFirstClass;
    }

    public void setRadioFirstClass(WebElement radioFirstClass) {
        this.radioFirstClass = radioFirstClass;
    }

    public WebElement getSelectAirline() {
        return selectAirline;
    }

    public void setSelectAirline(WebElement selectAirline) {
        this.selectAirline = selectAirline;
    }

    public WebElement getButContinue() {
        return butContinue;
    }

    public void setButContinue(WebElement butContinue) {
        this.butContinue = butContinue;
    }
}
