Feature: RetailHomeSteps
	@Home
  Scenario: Verify user can sign up into Retail Application
    Given User is on retail website
    When User click on Sign in option
    And User click on Create New Account button
    And User fill the signUp information with below data
      | name    | email                    | password  | confirmPassword |
      | student | newStudent@tekschool.us  | Tek@12345 | Tek@12345        |
    And User click on SignUp button
    Then User should be logged into account page
