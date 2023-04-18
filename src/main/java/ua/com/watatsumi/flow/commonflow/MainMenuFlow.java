package ua.com.watatsumi.flow.commonflow;

import ua.com.watatsumi.pages.fragments.MainMenu;
import org.openqa.selenium.WebDriver;

public class MainMenuFlow {

    private MainMenu mainMenu;

    public MainMenuFlow(WebDriver driver) {
        mainMenu = new MainMenu(driver);
    }

    public MainMenu getMainMenu() {
        return mainMenu;
    }

//    public void navigateToContacts() { mainMenu.getContactsButton().click();
//    }
}
