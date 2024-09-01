package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver) {
        super(driver);
    }


    public boolean hasLogoutLink() {
        return getWebElenements(By.xpath("//a[normalize-space()='Log Out']")).size() > 0;
    }
}
