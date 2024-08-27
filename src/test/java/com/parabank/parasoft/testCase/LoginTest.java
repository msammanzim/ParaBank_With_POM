package com.parabank.parasoft.testCase;

import com.parabank.parasoft.pages.AccountOverViewPage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.utill.General;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BageTest{
    @Test
    public void doLoginWithUsernameShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fllUserName("sasdasdas")
                .clickLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError() );

    }
    @Test
    public void doLoginWithPasswordShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        loginPage = loginPage
                .fllPassWord("asasa")
                .clickLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError() );

    }
    @Test
    public void doLoginShouldFail(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        loginPage = loginPage
                .clickLoginLinkBtn();

        Assert.assertTrue(loginPage.hasError() );

    }
    @Test
    public void doLoginSuccessfull()
    {
        LoginPage loginPage=page.getInstance(LoginPage.class);
      AccountOverViewPage overViewPage = loginPage
                .fllUserName("sqa")
                .fllPassWord("sqa")
                .clickLoinBtn();
      Assert.assertTrue(overViewPage.hasLogoutLink());

    }
    @Test
    public void checkPageTitle(){
        LoginPage loginPage=page.getInstance(LoginPage.class);
        Assert.assertEquals(loginPage.getPageTitle(),General.LOGIN_TITLE);
    }
}
