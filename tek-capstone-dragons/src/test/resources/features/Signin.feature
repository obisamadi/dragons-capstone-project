@Regression
Feature: Retail SignIn Page

  #@Signin
  Scenario Outline: Verify user can create account on tek retail website
    Given User is on retail website home page
    Then User verify retail website title
    And User click on sign in option
    And User click on create new account button
    And User enter '<name>' and '<email>' and '<password>' and '<confirmpassword>'
    And User click on signup button
    Then User see his profile page

    Examples: 
      | name         | email                  | password         | confirmpassword  |
      | Ubaid Samadi | ubaid.samadi@kabul.af | heLcpDAMDpMGD4U! | heLcpDAMDpMGD4U! |
