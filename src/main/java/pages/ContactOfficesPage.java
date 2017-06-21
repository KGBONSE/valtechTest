package pages;


import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ContactOfficesPage{
	public ContactOfficesPage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(contactHeader));
	}

	WebDriver driver;
	
	@FindBy(css=".contactheader")
	private WebElement contactHeader;
	
	@FindAll({@FindBy(css="a[href^='/about/contact-us']")})
	private List<WebElement> listItemOffices;
	
    public void outPutNoOfValtechOffices(){
        System.out.println("Number of Valtech Offices: " + listItemOffices.size());
    }

}
