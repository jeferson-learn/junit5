package org.example.newtours.actions;

import org.example.newtours.objects.NewtoursFlightsObjects;
import org.example.newtours.objects.NewtoursHomeObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewtoursFlightsActions {


    private WebDriver driver;
    private static NewtoursHomeObjects homeObjects;
    private static NewtoursFlightsObjects flightsObjects;

    public NewtoursFlightsActions(WebDriver driver) {
        this.driver = driver;
        homeObjects = new NewtoursHomeObjects(driver);
        flightsObjects = new NewtoursFlightsObjects(driver);
        PageFactory.initElements(driver, this);
    }

    public void procurarVoo() {
        flightsObjects.getRadioOneWay().click();
        flightsObjects.getButContinue().click();
    }
}
