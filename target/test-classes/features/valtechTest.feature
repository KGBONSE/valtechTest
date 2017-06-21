Feature: valtech QA assignment 
	As a QA tester
    I want to be able to navigate to the homepage
    So that i can do some assertions
@test
Scenario: Asserting that the latest news is displayed on the home page 
	Given I am on the valtech home page 
	Then I should see the latest news displayed 
@test	
Scenario Outline: Asserting H1 tags on various pages contains titles 
	Given I am on the valtech home page 
	When I visit the page "<Page Name>" 
	Then I should see the page name "<Page Name>" 
	Examples: 
		| Page Name|
		| ABOUT    | 
		| SERVICES |
		| WORK     |
@test		
Scenario: Outputing the total number of valtech offices 
	Given I am on the valtech home page
	When I navigate to the contact page 
	Then I should see the total number of valtech offices 
