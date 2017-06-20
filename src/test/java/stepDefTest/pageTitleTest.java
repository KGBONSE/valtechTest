package stepDefTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.pageTitlePage;


public class pageTitleTest {
    pageTitlePage pages = new pageTitlePage();

    @When("^I  visit the page \"([^\"]*)\"$")
    public void i_visit_the_page(String pageName) throws Throwable {
//    pages.titlePageAssertions(pageName);
    }

    @Then("^I should see the page name \"([^\"]*)\"$")
    public void i_should_see_the_page_name(String title) throws Throwable {

    }
}