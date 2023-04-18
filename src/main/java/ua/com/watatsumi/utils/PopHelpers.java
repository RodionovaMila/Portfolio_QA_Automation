package ua.com.watatsumi.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class PopHelpers {

    private static final By CLOSE_HURRY_POP_UP_BUTTON = By.xpath("//*[@id='fancybox-container-1']/div[2]/div[4]/div/div/button");

    private static final By CLOSE_APP_POP_UP_BUTTON = By.xpath("/html/body/div[7]/button");
    private PopHelpers() {
    }

    public static void closeHurryPopUpButton(WebDriver driver) {
        try {
            driver.findElement(CLOSE_HURRY_POP_UP_BUTTON)
                    .click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop up is not displayed");
        }
    }

    public static void closeAppPopUpButton(WebDriver driver) {
        try {
            driver.findElement(CLOSE_APP_POP_UP_BUTTON)
                    .click();
        } catch (NoSuchElementException e) {
            System.out.println("Pop up is not displayed");
        }
    }

}

