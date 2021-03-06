package amazon;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends NewHomePage {


    @Test(priority = 2)
    public void testCheckSearchBox(){
        checkSearchBox();
        String expectedText="\"\"";
        String actualText=driver.findElement(By.tagName("#ap_container")).getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }


@Test(priority = 1)
     public void testPageTitle(){
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Page title not match");

    }


















}
