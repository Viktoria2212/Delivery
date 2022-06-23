package ru.deliveryClub;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static ru.deliveryClub.WebDriverSettings.driver;

public class MainPage {
    public static WebElement shopsButton =
            driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[2]/div/div/div[1]/div[2]/div/button/h1"));
}
