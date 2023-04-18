package ua.com.watatsumi.navigation;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.com.watatsumi.BaseTest;
import ua.com.watatsumi.flow.ContactsFlow;
import ua.com.watatsumi.flow.LoginFlow;

import static ua.com.watatsumi.utils.PopHelpers.closeAppPopUpButton;
import static ua.com.watatsumi.utils.PopHelpers.closeHurryPopUpButton;

public class NavigationTest extends BaseTest {

    private LoginFlow loginFlow = new LoginFlow(driver);
    private ContactsFlow contactsFlow = new ContactsFlow(driver);

    @BeforeEach
    public void openPage() {
        driver.get("https://watatsumi.com.ua");
        driver.manage().window().maximize();
        closeHurryPopUpButton(driver);
        closeAppPopUpButton(driver);

    }

    @Test
    public void testNavigateToContacts() throws InterruptedException {
        Thread.sleep(5000);
        loginFlow.getMainMenuFlow();
//
    }

    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }
}