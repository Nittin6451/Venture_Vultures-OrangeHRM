
Feature: Login to orangehrm.com

  Background:
    Given User landed at orangehrm.com HomePage

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enter the username and password
    And User clicks login button
    Then User see the login successful message

  @InvalidCredentials
  Scenario: Login with Invalid Credentials
    When User enter the invalid username and password
    And User clicks login button
    Then User see the error message
