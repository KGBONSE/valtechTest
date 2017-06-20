package stepDefTest;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pages.homePage;

public class valtechStepDefTest{
homePage page = new homePage();


    @Given("^I navigate to the valtech home page$")
    public void i_navigate_to_the_valtech_home_page() throws Throwable {
        page.navigateToHomePage();
    }

    @Then("^I should see the latest news displayed$")
    public void i_should_see_the_latest_news_displayed() throws Throwable {
        page.homePageAssertions();
    }

////
////    @When("^I  visit the page \"([^\"]*)\"$")
////    public void i_visit_the_page(String pageName) throws Throwable {
////
////    }
////        @Then("^I should see the page name \"([^\"]*)\"$")
////        public void i_should_see_the_page_name (String title) throws Throwable {
//
//
//        }
    }