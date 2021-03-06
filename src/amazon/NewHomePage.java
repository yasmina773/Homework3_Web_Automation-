package amazon;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewHomePage {

    WebDriver driver;
    String amazonUrl="https://www.amazon.com/";
    String productName="Mask";
    String searchBoxLocator="twotabsearchtextbox";
    String searchButtonLocator="nav-search-submit-button";




  @Test
  public void testCheckSearchBox(){
      checkSearchBox();
      String expectedText="\"Mask\"";
      String actualText=driver.findElement(By.xpath("//*[@id=\"search\"]/span/div/span/h1/div/div[1]/div/div/span[3]")).getText();
      Assert.assertEquals(actualText,expectedText,"Product does not match");
      }
  //action method
  public void checkSearchBox(){
    //Enter product name:
    driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
    //Click on searchButton:
    driver.findElement(By.id(searchButtonLocator)).click();
}

 @AfterMethod
     public void tearDown(){//one of the common name the industry use for closing the driver
     //driver.close() ;

     //driver.quit();
 }





}
