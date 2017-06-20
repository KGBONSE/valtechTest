
  Feature: valtech QA assignment
    As a QA tester
    I want to be able to navigate to the homepage
    So that i can do some assertions

#    Scenario: Asserting that the latest news is displayed on the home page
#
#     Given I navigate to the valtech home page
#      Then I should see the latest news displayed
#
      Scenario Outline: Asserting H1 tags on various pages contains titles
        Given I navigate to the valtech home page
        When I  visit the page "<pageName>"
        Then I should see the page name "<title>"


        Examples:
          | pageName | title   |
#          | ABOUT    | Aboutd   |
#          | SERVICE  | Service |
#          | WORK     | Work    |

    Scenario Outline: Outputing the total number of valtech offices
      Given I navigate to the valtech home page
#      When I  visit the contact page "<pageName>"
      When I navigate to the contact page
      Then I should see the total number of valtech offices
      
      Examples: 
      |pageName|
      |  Contact      |
