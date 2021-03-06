package com.multicard.homework;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestApp extends HomePage {

    @Test(priority = 1)
    public void accessoriesSectionTest() {
        accessoriesSection();
        String expectedText = "MultiCard";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "the results match");
    }

    @Test(priority = 2)
    public void clothingSectionTest() {
        clothingSection();
        String expectedText = "MultiCard";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "the results match");
    }

    @Test(priority = 3)
    public void cofeeMakersSectionTest() {
        cofeeMakersSection();
        String expectedText = "MultiCard";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "the results match");
    }

    @Test(priority = 4)
    public void digitalSectionTest() {
        digitalSection();
        String expectedText = "MultiCard";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "the results match");
    }
    }


