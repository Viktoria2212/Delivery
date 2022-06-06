package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/nina.belova/Downloads/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
    }
    @Test
    public void firstTest() {
        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertEquals("Delivery Club — Доставка еды и продуктов", title);
    }

    @After
    public void close() {
        driver.quit();
    }
}
