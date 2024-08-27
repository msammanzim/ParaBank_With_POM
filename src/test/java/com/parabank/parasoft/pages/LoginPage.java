package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public LoginPage fllUserName(String username) {
        getWebElement(By.xpath("//input[@name='username']")).sendKeys(username);

        return this;
    }

    public LoginPage fllPassWord(String password) {
        getWebElement(By.xpath("//input[@name='password']")).sendKeys(password);
        return this;
    }

    public AccountOverViewPage clickLoinBtn() {
        getWebElement(By.xpath("//input[@value='Log In']")).click();

        return getInstance(AccountOverViewPage.class);
    }
    public LoginPage clickLoginLinkBtn(){
        getWebElement(By.xpath("//input[@value='Log In']")).click();
        return this;
    }

    public CustomerLookup clickForgetLink() {
        getWebElement(By.xpath("//a[normalize-space()='Forgot login info?']")).click();

        return getInstance(CustomerLookup.class);
    }

    public SigningUp clickRegistration() {
        getWebElement(By.xpath("//a[normalize-space()='Register']")).click();
        return getInstance(SigningUp.class);
    }

    public boolean hasError(){
        return getWebElenements(By.ByClassName.className("error")).size()>0;

    }
}
