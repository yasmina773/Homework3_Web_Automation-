package com.multicard.homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class HomePage {

    WebDriver driver;
    String url = "https://www.demo.iscripts.com/multicart/demo/";


    @BeforeMethod
    public void ChromeSetup() {
        String chromePath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromePath);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get(url);
    }


    public void accessoriesSection(){

        driver.findElement(By.linkText("Accessories")).click();
    }

    public void clothingSection(){
        driver.findElement(By.linkText("Clothing")).click();
    }

   public void cofeeMakersSection(){
        driver.findElement(By.linkText("Cofee makers")).click();
   }

   public void digitalSection(){
        driver.findElement(By.linkText("Digital")).click();

   }

    @AfterMethod
    public void tearDown() {//one of the common name the industry use for closing the driver
        //driver.close() ;

        //driver.quit();
    }



}
