@withdrawal
Feature: deliveryClub.ru landing automation

  Scenario: The user goes from the main page to the "Магазины" page
    Given User opens "https://www.delivery-club.ru/" page in browser
    When User clicks "Магазины" link
    Then "https://www.delivery-club.ru/moscow/grocery" link is opened