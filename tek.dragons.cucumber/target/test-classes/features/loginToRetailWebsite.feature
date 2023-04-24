Feature: Login

Background:
	Given User is on retail website home page
	Then User verify retail website title
	And I click on sign in button

@loginToWebsite
Scenario: Login to tek retail website
	And I enter username and password
		|dragons102@gmail.com|Drag@ons123|
	And I click on login button on login page

@loginToWebsite2
Scenario: Login to tek retail website2
	And I enter email and password
	|email|password|
	|dragons102@gmail.com|Drag@ons123|
	And I click on login button on login page

@loginToWebsite3
Scenario: Login to tek retail website3
	And I enter user information
	"""
	{
	"username": "dragons102@gmail.com",
	"password": "Drag@ons123"
	}
	"""

@printValues
Scenario: print values
	And I print the following data
	"""
	{
	"username": "dragons102@gmail.com",
	"password": "Drag@ons123",
	"number": 30
	}
	"""
	
