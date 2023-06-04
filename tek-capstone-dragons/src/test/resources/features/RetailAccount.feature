@Regression
Feature: Retail Account Page

  Background: 
    Given User is on retail website
    When User click on Sign in option
    And User enter email 'EmailValue' and password 'PasswordValue'
    And User click on login button
    And User should be logged in into Account

 # @Account2
  Scenario: Verify User can update Profile Information
    When User click on Account option
    And User update Name 'Ubaid' and Phone '5408410419'
    And User click on Update button
    Then user profile information should be updated

 # @Account3
  Scenario: Verify User can add a payment method
    When User click on Account option
    And User click on Add a payment method link
    And User fill Debit or credit card information
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0987878787878777      | Ubaid Samadi      | 08           | 28          | 119       |
    And User click on Add your card button
    Then a message should be displayed 'Payment Method added successfully'

  # @Account4
  Scenario: Verify User can edit Debit or Credit card
    When User click on Account option
    And User click on Edit option of card section
    And user edit information with below data
      | cardNumber | nameOnCard | expirationMonth | expirationYear | securityCode |
      | 0987878787878768      | Ubaid Sama       | 09           | 29          | 112        |
    And user click on Update Your Card button
    Then a message should be displayed ‘Payment Method updated Successfully’

  # @Account5
  Scenario: Verify User can remove Debit or Credit card
    When User click on Account option
    And User click on remove option of card section
    Then payment details should be removed

  # @Account6
  Scenario: Verify User can add an Address
    When User click on Account option
    And User click on Add address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | United States   | Ubaid Samadi   | 5408410419       | 899 N Orange Ave        | Apt 532 | Orlando | Florida | 32807   |
    And User click Add Your Address button
    Then a message should be displayed ‘Address Added Successfully’

  # @Account7
  Scenario: Verify User can edit an Address added on account
    When User click on Account option
    And User click on edit address option
    And user fill new address form with below information
      | country | fullName | phoneNumber | streetAddress | apt   | city  | state | zipCode |
      | United States   | Ubaid Sam    | 5408410416       | 899 N Orange Ave         | Apt 522 | Miami | Florida | 32808   |
    And User click update Your Address button
    Then a message should be displayed ‘Address Updated Successfully’

  # @Account8
  Scenario: Verify User can remove Address from Account
    When User click on Account option
    And User click on remove option of Address section
    Then Address details should be removed
