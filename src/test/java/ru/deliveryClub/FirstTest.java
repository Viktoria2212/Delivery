package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {
    @Test
    public void firstTest() {
        System.setProperty("webdriver.chrome.driver", "/Users/nina.belova/Downloads/chromedriver_win32/chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        driver.get("https://www.delivery-club.ru/");

        String title = driver.getTitle();
        Assert.assertEquals("Delivery Club — Доставка еды и продуктов", title);

        driver.quit();
    }
}
