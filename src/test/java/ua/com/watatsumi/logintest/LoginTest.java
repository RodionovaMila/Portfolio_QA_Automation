package ua.com.watatsumi.logintest;

import ua.com.watatsumi.BaseTest;
import ua.com.watatsumi.flow.LoginFlow;
import org.junit.jupiter.api.*;



public class LoginTest extends BaseTest {

    private LoginFlow loginFlow = new LoginFlow(driver);

    @BeforeEach
    public void openPage() {
        driver.manage().window().maximize();
        driver.get("https://watatsumi.com.ua/my-account/");

    }

    @Test
    public void testErrorLoginText() {
        loginFlow.setEmailAddressField("test@gmail.com");
        loginFlow.clickSubmitButton();
        Assertions.assertTrue(loginFlow.isPasswordErrorDisplayed());
        Assertions.assertEquals(loginFlow.getPasswordErrorText(), "ОШИБКА: Вы не ввели пароль.");
    }

    @Test
    public void testErrorPasswordText() {
        loginFlow.setPasswordField("qwerty");
        loginFlow.clickSubmitButton();
        Assertions.assertTrue(loginFlow.isEmailErrorDisplayed());
        Assertions.assertEquals(loginFlow.getLoginErrorText(), "Ошибка: Необходимо ввести имя пользователя.");
    }

    @AfterEach
    public void clean() {
        driver.manage().deleteAllCookies();
    }

}
