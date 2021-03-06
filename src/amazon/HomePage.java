package amazon;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage {


    public static void main(String[] args) throws InterruptedException {
        String amazonUrl="https://www.amazon.com/";
        String productName="Mask";
        String searchBoxLocator="twotabsearchtextbox";
        String searchButtonLocator="nav-search-submit-button";


//        String yasmina="BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",yasmina);
//        WebDriver Billy=new FirefoxDriver();
//        Billy.get("https://www.amazon.com/");

        //chromeBrowser
        String chromeDriverPath="BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver",chromeDriverPath);
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.com/");
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mask");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(5000);
        driver.close();

       // Edge
//        String edgeDriverPath="BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver",edgeDriverPath);
//        WebDriver driver2=new EdgeDriver();
//        driver2.get(amazonUrl);
//        driver2.manage().window().fullscreen();
//        driver2.manage().deleteAllCookies();
//        driver2.findElement(By.id(searchBoxLocator)).sendKeys(productName);
//        driver2.findElement(By.id(searchButtonLocator)).click();
//        Thread.sleep(5000);
//        driver2.close();

        //Firefox
//
//        String fireFoxDriverPath="BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",fireFoxDriverPath);
//        WebDriver driver3=new FirefoxDriver();
//        driver3.get("https://www.amazon.com/");
//        driver3.manage().window().fullscreen();
//        driver3.manage().deleteAllCookies();
//        Thread.sleep(5000);
//        driver3.close();
//
//

    }
}
