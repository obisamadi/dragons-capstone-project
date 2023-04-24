Feature: Login

Background:
	Given User is on retail website home page
	Then User verify retail website title
	
@register
Scenario Outline: Verify user can create account on tek retail website
	And I click on sign in button
	And I click on create new account button
	And I enter user '<name>' and '<email>' and '<password>' and '<confirmPass>'
	And I click on signup button
	And I should see my profile page
	
Examples:
|name|email|password|confirmPass|
|dragons|dragons9902@gmail.com|Drag@ons123|Drag@ons123|