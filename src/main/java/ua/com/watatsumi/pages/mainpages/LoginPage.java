package ua.com.watatsumi.pages.mainpages;

import ua.com.watatsumi.pages.AbstractClass;
import ua.com.watatsumi.utils.WaitersManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage extends AbstractClass {

    private static final String title = "Авторизация";
    private static final By EMAIL_ADDRESS_FIELD = By.id("username");
    private static final By PASSWORD_FIELD = By.id("password");
    private static final By SUBMIT_BUTTON = By.xpath("//*[@id='customer_login']/div[1]/form/p[3]/button");
    private static final By PASSWORD_ERROR = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/ul/li");

    private static final By EMAIL_ERROR = By.xpath("/html/body/div[2]/div/div[2]/div/div/div/div/div[1]/ul/li");

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getEmailField() {
        return WaitersManager.waitUntilElementIsVisible(driver, EMAIL_ADDRESS_FIELD);
    }

    public WebElement getPasswordField() {
        return driver.findElement(PASSWORD_FIELD);
    }

    public WebElement getSubmitButton() {
        return WaitersManager.waitUntilElementIsClickable(driver, SUBMIT_BUTTON);
    }

    public WebElement getPasswordError() {
        return driver.findElement(PASSWORD_ERROR);
    }

    public String getTitle() {
        return title;
    }


    public WebElement getLoginError() {
        return driver.findElement(EMAIL_ERROR);
    }
}
