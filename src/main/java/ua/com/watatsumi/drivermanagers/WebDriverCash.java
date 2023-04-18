package ua.com.watatsumi.drivermanagers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class WebDriverCash {

    private static Map<String, WebDriver> drivers = new HashMap<>();

    private WebDriverCash() {}

    public static WebDriver getDriver(String chrome) {
        if (Objects.nonNull(drivers.get("chrome"))
                && Objects.nonNull(((RemoteWebDriver)drivers.get("chrome")).getSessionId())) {
            return drivers.get("chrome");
        } else {
            drivers.put("chrome", WebDriverFactory.getDriver("chrome"));
            return drivers.get("chrome");
        }
    }
}
