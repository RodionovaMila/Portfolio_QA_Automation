package ua.com.watatsumi.flow;

import org.openqa.selenium.WebDriver;
import ua.com.watatsumi.flow.commonflow.BaseFlow;
import ua.com.watatsumi.pages.mainpages.ContactsPage;

public class ContactsFlow extends BaseFlow {

    private ContactsPage contactsPage;

    public ContactsFlow(WebDriver driver) {
        super(driver);
        this.contactsPage = new ContactsPage(driver);
    }

    public ContactsPage getContactPage() { return contactsPage; }

    public String getHeaderText() {
        return contactsPage.getPageHeader().getText();
    }
}
