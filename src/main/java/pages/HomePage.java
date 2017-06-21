package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
		PageFactory.initElements(driver, this);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(contactIcon));
	}

	WebDriver driver;
	@FindBy(css = "div.news-post__listing-header h2.block-header__heading")
	private WebElement latestNewsSection;

	@FindBy(css = "div.hamburger__front_lang i.icons.glyph")
	private WebElement contactIcon;

	@FindBy(css = "label.hamburger")
	private WebElement showMenu;

	@FindBy(css = "li.navigation__menu__item a[href='/about/']")
	private WebElement aboutMenu;

	@FindBy(css = "li.navigation__menu__item a[href='/services/']")
	private WebElement servicesMenu;

	@FindBy(css = "li.navigation__menu__item a[href='/cases/']")
	private WebElement workMenu;

	public void shouldVerifyLatestNewsSection(String sectionText) {
		Assert.assertTrue("Latest News Section not found", latestNewsSection.getText().equalsIgnoreCase(sectionText));
	}

	public void navigateToContactsPage() {
		contactIcon.click();
	}

	public void navigateToPage(String pageName) {
		showMenu.click();
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(aboutMenu));
		if (pageName.equals("ABOUT")) {
			aboutMenu.click();

		} else if (pageName.equals("WORK")) {
			workMenu.click();

		} else {
			servicesMenu.click();

		}
		
		
	}

}
