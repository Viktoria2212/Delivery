package ru.deliveryClub;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import static ru.deliveryClub.WebDriverSettings.driver;

public class Steps {
    @Given("^User opens \"([^\"]*)\" page in browser$")
    public void user_opens_page_in_browser(String url) {
        driver.get(url);
        Assert.assertEquals("Delivery Club — Доставка еды и продуктов", driver.getTitle());
    }

    @When("User clicks shopsButton link")
    public void user_clicks_link() {
        MainPage.shopsButton.click();
    }


    @Then("^\"([^\"]*)\" link is opened$")
    public void link_is_opened(String shopsurl) {
        Assert.assertEquals(shopsurl, driver.getCurrentUrl());
    }
}

    /*@Given("User opens {string} page in browser")
    public void user_opens_page_in_browser(String url) {
        driver.get(url);
        Assert.assertEquals("Delivery Club — Доставка еды и продуктов", driver.getTitle());
    }

    @When("User clicks {string} link")
    public void user_clicks_link() {
        MainPage.shopsButton.click();
    }

    @Then("{string} link is opened")
    public void link_is_opened() {
        Assert.assertEquals("https://www.delivery-club.ru/moscow/grocery", driver.getCurrentUrl());
    }
}*/


