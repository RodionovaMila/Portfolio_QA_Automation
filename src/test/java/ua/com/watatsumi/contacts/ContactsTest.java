package ua.com.watatsumi.contacts;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.com.watatsumi.BaseTest;
import ua.com.watatsumi.flow.ContactsFlow;

import static ua.com.watatsumi.utils.PopHelpers.closeAppPopUpButton;

public class ContactsTest extends BaseTest {

    private ContactsFlow contactsFlow = new ContactsFlow(driver);

    @BeforeEach
    public void navigateToContacts() {
        driver.get("https://watatsumi.com.ua/kontakty");
        driver.manage().window().maximize();
        closeAppPopUpButton(driver);
    }

    @Test
    public void testContactsHeader() {
        String expected = "Контакты";
        Assertions.assertEquals(expected, contactsFlow.getHeaderText());

    }

    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }
}

