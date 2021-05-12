package org.example.newtours.actions;

import org.example.newtours.objects.NewtoursRegisterObjects;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class NewtoursRegisterActions {

    private WebDriver driver;
    private static NewtoursRegisterObjects registerObjects;

    public NewtoursRegisterActions(WebDriver driver) {
        this.driver = driver;
        registerObjects = new NewtoursRegisterObjects(driver);
        PageFactory.initElements(driver, this);
    }

    public void feitoRegister() {
        registerObjects.getInputFirstName().sendKeys("jeferson");
        registerObjects.getInputLastName().sendKeys("lopez");
        registerObjects.getInputPhone().sendKeys("123456789");
        registerObjects.getInputEmail().sendKeys("jeferson@jeferson");
        registerObjects.getInputAddress().sendKeys("assis brasil");
        registerObjects.getInputCity().sendKeys("porto alegre");
        registerObjects.getInputState().sendKeys("RS");
        registerObjects.getInputCode().sendKeys("92440094");
        registerObjects.getSelectCountry().sendKeys("fulano");
        registerObjects.getInputUserName().sendKeys("jefinho");
        registerObjects.getInputPassword().sendKeys("321654897");
        registerObjects.getInputConfirmPassword().sendKeys("321654897");
        registerObjects.getButEnviar().click();
    }
}
