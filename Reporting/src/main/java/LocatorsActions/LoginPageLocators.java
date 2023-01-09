package LocatorsActions;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPageLocators {
    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement password;

    @FindBy(id = "logInPanelHeading")
    public WebElement titleText;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement login;

    @FindBy(xpath = "//div//p[contains(text(),'Invalid credentials')]")
    public  WebElement errorMessage;

    @FindBy(xpath = "//*[@id='social-icons']/a[1]/img")
    public  WebElement linkedInIcon;

    @FindBy(xpath = "//*[@id='social-icons']/a[6]/img")  //Invalid Xpath
    public  WebElement faceBookIcon;
}
