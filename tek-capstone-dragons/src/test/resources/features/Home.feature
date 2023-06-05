@Regression
Feature: RetailHomeSteps

 Background: 
    Given User is on retail website home page
    
	#@Home
   Scenario: Verify user can sign in into Retail application
    Then User verify retail website title
    And User click on sign in option
    When User enter email 'ubaid.samadi@tekschool.us' and password 'heLcpDAMDpMGD4U!'
    And User click on login button
    Then user should be logged into Account

    #@Home2
  Scenario: Verify department sidebar options
    When User click on All section
    And User on '<department>'
    Then below options are present in department
      | <optionOne> | <optionTwo> |

    Examples: 
      | department  | optionOne                      | optionTwo                |
      | Electronics | TV & Video                     | Video Games              |
      | Computers   | Accessories                    | Networking               |
      | Smart Home  | Smart Home Lightning           | Plugs and Outlets        |
      | Sports      | Athletic Clothing              | Exercise & Fitness       |
      | Automotive  | Automative Parts & Accessories | MotorCycle & Powersports |