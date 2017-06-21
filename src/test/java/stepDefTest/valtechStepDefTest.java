package stepDefTest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.
		ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pages.*;

import java.util.concurrent.TimeUnit;

public class valtechStepDefTest {
	public valtechStepDefTest() {
		super();
	}

	WebDriver driver;
	private HomePage homePage;
	private ContactOfficesPage noOfOffices;
	private AboutPage aboutPage;
	private WorkPage workPage;
	private ServicesPage servicesPage;

	@Before
	public void prepare() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();

//		driver.manage().window().maximize();
		String baseUrl = "http://www.valtech.com";
		driver.get(baseUrl);
	}

	@After
	public void cleanUp() {
		driver.close();
	}

	@Given("^I am on the valtech home page$")
	public void i_am_on_the_valtech_home_page() throws Throwable {
		homePage = PageFactory.initElements(driver, HomePage.class);
	}

	@Then("^I should see the latest news displayed$")
	public void i_should_see_the_latest_news_displayed() throws Throwable {
		homePage.shouldVerifyLatestNewsSection("latest news");
	}

	@When("^I navigate to the contact page$")
	public void i_navigate_to_the_contact_page() throws Throwable {
		homePage.navigateToContactsPage();
	}

	@Then("^I should see the total number of valtech offices$")
	public void i_should_see_the_total_number_of_valtech_offices() throws Throwable {
		noOfOffices = PageFactory.initElements(driver, ContactOfficesPage.class);
		noOfOffices.outPutNoOfValtechOffices();
	}
	
    @When("^I visit the page \"([^\"]*)\"$")
    public void i_visit_the_page(String pageName) throws Throwable {
    	homePage.navigateToPage(pageName);
    }
    
    @Then("^I should see the page name \"([^\"]*)\"$")
    public void i_should_see_the_page_name(String title) throws Throwable {

		if (title.equals("ABOUT")) {
			aboutPage = PageFactory.initElements(driver, AboutPage.class);
			aboutPage.shouldVerifyPageHeader(title);

		} else if (title.equals("SERVICES")) {
			servicesPage = PageFactory.initElements(driver, ServicesPage.class);
			servicesPage.shouldVerifyPageHeader(title);

		} else {
			workPage = PageFactory.initElements(driver, WorkPage.class);
			workPage.shouldVerifyPageHeader(title);

		}
    }

}