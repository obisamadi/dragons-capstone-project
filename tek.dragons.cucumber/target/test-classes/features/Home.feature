@test
Feature: Retail Home Page

Background:
	Given User is on retail website home page
	Then User verify retail website title

Scenario: Verify user can search playstation under electronics
	When User changes category to 'Electronics'
	And User enter name item name 'Playstation'
	And User click on search button
	Then Item should be present on the page

@smokeTest
Scenario: Verify user can shop by category
	Then User see the title 'Shop By Category' is present