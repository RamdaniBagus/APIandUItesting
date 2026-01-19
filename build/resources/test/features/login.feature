Feature: Login SauceDemo

  Scenario: Login valid
    Given user open login page
    When user login using "standard_user" and "secret_sauce"
    Then user should be redirected to inventory page
