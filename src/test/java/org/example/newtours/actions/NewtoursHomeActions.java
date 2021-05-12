package org.example.newtours.actions;

import org.example.newtours.objects.NewtoursHomeObjects;
import org.example.newtours.objects.NewtoursRegisterObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewtoursHomeActions {

    private static NewtoursHomeObjects homeObjects;

    public NewtoursHomeActions(WebDriver driver) {
        homeObjects = new NewtoursHomeObjects(driver);
        PageFactory.initElements(driver, this);
    }

    public void login() {
        homeObjects.getInputName().sendKeys("jeferson");
        homeObjects.getInputPassword().sendKeys("123456789");
        homeObjects.getButSubmit().click();
    }

    public void abaRegister() {
        homeObjects.getLinkRegister().click();
    }

    public void menuFlights() {
        homeObjects.getLinkFlights().click();
    }

}
