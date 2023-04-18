package ua.com.watatsumi.flow;

import ua.com.watatsumi.flow.commonflow.BaseFlow;
import ua.com.watatsumi.pages.mainpages.LoginPage;
import org.openqa.selenium.WebDriver;

public class LoginFlow extends BaseFlow {

    private LoginPage loginPage;

    public LoginFlow(WebDriver driver) {
        super(driver);
        loginPage = new LoginPage(driver);
    }

    public LoginPage getLoginPage() {
        return loginPage;
    }

    public void setEmailAddressField(String emailAddressFiled) {
        loginPage.getEmailField()
                .sendKeys(emailAddressFiled);
    }

    public void setPasswordField(String password) {
        loginPage.getPasswordField()
                .sendKeys(password);
    }


    public void clickSubmitButton() {
        loginPage.getSubmitButton().click();
    }

    public String getPasswordErrorText() {
        return loginPage.getPasswordError().getText();
    }

    public String getLoginErrorText() {
        return loginPage.getLoginError().getText();
    }

    public boolean isPasswordErrorDisplayed() {
        return loginPage.getPasswordError().isDisplayed();
    }

    public boolean isEmailErrorDisplayed() {
        return loginPage.getLoginError().isDisplayed();
    }

    public void login(String email, String passWord) {
        setEmailAddressField(email);
        setPasswordField(passWord);
        clickSubmitButton();
    }
}
