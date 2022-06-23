package ru.deliveryClub;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {

    public static ChromeDriver driver;

    @Before
    public void beforeHook() {
        System.setProperty("webdriver.chrome.driver", "/Users/Vika/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @After
    public void afterHook() {
        driver.quit();
    }
}
