package pages;

import junit.framework.Assert;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by markkofi on 09/06/2017.
 */
public class homePage {

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, 30);

    public void navigateToHomePage(){

        driver.get("http://www.valtech.com");
    }
   @After
    public void tearDown(){
        driver.quit();

   }
   public void homePageAssertions(){
       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='container']/div[2]/div[3]/div[1]/header/h2"))).getText();
       Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='container']/div[2]/div[3]/div[1]/header/h2")).getText().contains("LATEST NEWS"));
   }
}

