package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WorkPage {
	public WorkPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.visibilityOf(pageHeader));
	}
	
	WebDriver driver;
	@FindBy(css=".page-header>h1")
	private WebElement pageHeader;
	
	public void shouldVerifyPageHeader(String headerText){
		Assert.assertTrue("Works Page Header Text not found", pageHeader.getText().equalsIgnoreCase(headerText));
	}
}
