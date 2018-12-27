Feature: Login Functionality
  Scenario: Verify the login functionality
    Given I visit the page
    When I enter "<cs@gmail.com>" and "<test123>" in login fields
    And I click on submit button
    Then I should see the home page