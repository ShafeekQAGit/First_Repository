package LocatorsActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLocators {

    @FindBy(xpath = "//span//p[contains(text(),'Collings')]")
    public WebElement homePageUserName;
}
