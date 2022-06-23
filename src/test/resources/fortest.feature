@withdrawal
Feature: deliveryClub.ru landing automation

  Scenario: The user goes to the shops page
    Given User opens "https://www.delivery-club.ru/" page in browser
    When User clicks shopsButton link
    Then "https://www.delivery-club.ru/moscow/grocery" link is opened