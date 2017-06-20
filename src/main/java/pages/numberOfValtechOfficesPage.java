package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class numberOfValtechOfficesPage extends homePage{
    homePage pages = new homePage();

    public void outPutNoOfValtechOffices(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='contacticon']/div/div/div[1]/i"))).click();
//        List<WebElement> myRows = driver.findElements(By.xpath(".//*[@id='contactbox']/div"));
        int xpathCount = driver.findElements(By.xpath(".//*[@id='contactbox']/div")).size();
        System.out.println(xpathCount);
    }

}
