package pages;

import org.openqa.selenium.By;

public class pageTitlePage  extends homePage{
    homePage pages = new homePage();
 String aboutTitle = "About";
 String servicetitle;
 String workTitle;
    public void titlePageAssertions(String pageTitle, String is){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='menu-toggle-button']/span[1]/span/span[1]/i"))).click();

//        driver.findElement(By.xpath(".//*[@id='menu-toggle-button']/span[1]/span/span[1]/i")).click();
//        driver.findElement(By.linkText("ABOUT")).click();
//        if (aboutTitle) {
            driver.getTitle();
//        } else {

        }
//        driver.getTitle();
        String about = driver.findElement(By.xpath("//a[@href='products/']")).getCssValue("About");
    }


