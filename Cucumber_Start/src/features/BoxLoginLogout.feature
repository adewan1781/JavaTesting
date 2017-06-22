Feature: Verify that a valid user is able to login to the Box portal.

Scenario: BoxLoginLogout
	Given I navigate to Box app in firefox browser
	Then  Box Login page should open
	And login into the Box app
	Then All Files page should open
	When I click on Box Logout link
	Then Box Login page should open