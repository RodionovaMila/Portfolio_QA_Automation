package ua.com.watatsumi.pages.mainpages;

import ua.com.watatsumi.pages.AbstractClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactsPage extends AbstractClass {

    private static final By PAGE_HEADER = By.xpath("//h1");

    public ContactsPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getPageHeader() {
        return driver.findElement(PAGE_HEADER);
    }
}
