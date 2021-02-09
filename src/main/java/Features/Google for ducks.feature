@smookTest
Feature: Verify Google serch component 

Scenario: Successfully serch for duck in google 
	Given user go to the google home page 
	When user verify the title of the page as "Google"
	Then user type "ducks" in the serch box 
	And user verify that ducks were properly searched for
	And user close the browser. 