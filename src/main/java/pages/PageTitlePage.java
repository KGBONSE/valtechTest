package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageTitlePage{
	public PageTitlePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//WebDriverWait wait = new WebDriverWait(driver, 40);
		//wait.until(ExpectedConditions.elementToBeClickable(contactIcon));
	}
	
    WebDriver driver;
 String aboutTitle = "About";
 String servicetitle;
 String workTitle;
    public void titlePageAssertions(String pageTitle, String is){

            driver.getTitle();
    }
}

