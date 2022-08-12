package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AccountsPageTest extends BaseTest {

    @BeforeClass
    public void accountsPageSetup() {
        accountsPage = loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
    }

    @Test
    public void accountsPageTitleTest() {
        String title = accountsPage.getAccountsPageTitle();
        System.out.println("Account page title is: " + title);
        Assert.assertEquals(title, "My account - My Store");
    }


}
