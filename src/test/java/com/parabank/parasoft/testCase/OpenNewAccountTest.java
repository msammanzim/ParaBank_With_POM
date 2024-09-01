package com.parabank.parasoft.testCase;

import com.parabank.parasoft.pages.HomePage;
import com.parabank.parasoft.pages.LoginPage;
import com.parabank.parasoft.pages.OpenNewAccountPage;
import org.testng.annotations.Test;

public class OpenNewAccountTest extends BageTest{
    @Test

    public void openAccountShouldSucceed() {
        LoginPage loginPage = page.getInstance(LoginPage.class);
        HomePage homePage = loginPage
                .dologin(getUsername(), getPassword());
//       OpenNewAccountPage openNewAccountPage=homePage;
    }
}