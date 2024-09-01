package com.parabank.parasoft.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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

    public HomePage clickLoinBtn() {
        getWebElement(By.xpath("//input[@value='Log In']")).click();

        return getInstance(HomePage.class);
    }

    public LoginPage clickLoginLinkBtn() {
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

    public boolean hasError() {
        return getWebElenements(By.ByClassName.className("error")).size() > 0;

    }

    public HomePage dologin(String username, String password) {

        return fllUserName (username)
                .fllPassWord(password)
                .clickLoinBtn();
    }
    public OpenNewAccountPage clickOpenAccountLink(){

        getWebElement(By.cssSelector("a[href='openaccount.htm']")).click();
        return getInstance(OpenNewAccountPage.class);
    }

}
