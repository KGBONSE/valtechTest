package stepDefTest;


import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.numberOfValtechOfficesPage;

public class numberOfValtechOfficesTest {
    numberOfValtechOfficesPage noOfOffices = new numberOfValtechOfficesPage();
//    @When("^I  visit the contact page \"([^\"]*)\"$")
//    public void i_visit_the_contact_page(String arg1) throws Throwable {
//
//    }
    @When("^I navigate to the contact page$")
   public void i_navigate_to_the_contact_page() throws Throwable {
   noOfOffices.outPutNoOfValtechOffices();
}

    @Then("^I should see the total number of valtech offices$")
    public void i_should_see_the_total_number_of_valtech_offices() throws Throwable {

    }

}
