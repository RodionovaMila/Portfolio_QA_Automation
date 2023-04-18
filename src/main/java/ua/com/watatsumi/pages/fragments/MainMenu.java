package ua.com.watatsumi.pages.fragments;

import ua.com.watatsumi.pages.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainMenu extends AbstractClass {
//    private static final By MY_ACCOUNT = By.xpath("//*[@id='menu-item-106']/a");
//    private static final By MY_ACCOUNT_BUTTON = By.xpath("//*[@id='menu-item-106']/a");
    private static final By MY_CONTACTS = By.cssSelector(".map");

    public MainMenu(WebDriver driver) {
        super(driver);
    }

//    public WebElement getMyAccount() {
//        return driver.findElement(MY_ACCOUNT);
//    }
//
//    public WebElement getMyAccountButton() {
//        return driver.findElement(MY_ACCOUNT_BUTTON);
//    }

    public WebElement getContactsButton(){
        return driver.findElement(MY_CONTACTS);
    }


}