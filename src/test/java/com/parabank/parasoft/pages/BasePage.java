package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class BasePage extends Page {
    public BasePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public String getPageTitle() {
        return driver.getTitle().trim();
    }

    @Override
    public WebElement getWebElement(By locator) {
        WebElement element = null;
        try {
            element = driver.findElement(locator);

        } catch (Exception e) {
            System.out.println(locator.toString() + "Selector Or Locator not Found");
        }
        return element;
    }

    @Override
    public List<WebElement> getWebElenements(By locator) {
        List<WebElement> elements = null;
        try {
            elements = driver.findElements(locator);

        } catch (Exception e) {
            System.out.println(locator.toString() + "Selector Or Locator not Found");
        }
        return elements;
    }

    @Override
    public void waitForElement(By locatr) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(locatr));
        } catch (Exception e) {
            System.out.println(locatr.toString() + "Selector Or Locator not Found");
        }


    }
}
