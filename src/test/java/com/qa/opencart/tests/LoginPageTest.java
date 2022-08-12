package com.qa.opencart.tests;

import com.qa.opencart.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {

    @Test
    public void loginPageTitleTest() {
        //Test methods/client should not have any driver api
        String title = loginpage.getLoginPageTitle();
        System.out.println("Login page title is :" + title);
        Assert.assertEquals(title, "Login - My Store");
    }

    @Test
    public void forgotPwdLinkExist() {
        Assert.assertTrue(loginpage.isForgetPwdLinkExist());
    }

    @Test
    public void signInButtonExist() {
        Assert.assertTrue(loginpage.isSignInButtonExist());
    }

    @Test
    public void contactUsLinkExist() {
        Assert.assertTrue(loginpage.isContactUsLinkExist());
    }

    @Test
    public void signInLinkExist() {
        Assert.assertTrue(loginpage.isSignInLinkExist());
    }

    @Test(priority = 6)
    public void loginTest(){
        loginpage.doLogin(prop.getProperty("username"), prop.getProperty("password"));
    }
}
