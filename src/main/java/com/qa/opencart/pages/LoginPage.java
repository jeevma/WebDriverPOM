package com.qa.opencart.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {

    private WebDriver driver;

    //1. By Locator Object Repository - Private, encapsulation - private variables to be used by public methods (page action)
    private By username = By.id("email");
    private By password = By.id("passwd");
    private By loginButton = By.name("SubmitLogin");
    private By ForgotPassword = By.cssSelector("a[title='Recover your forgotten password']");
    private By contactUs = By.cssSelector("#contact-link");
    private By signIn = By.linkText("Sign in");


    //2. Constructor of page class - public
    public LoginPage(WebDriver driver) {
        this.driver = driver;   //pass this driver to the private WebDriver declaration
    }

    //3. page actions/methods:
    public String getLoginPageTitle() {
        return driver.getTitle();
    }

    public boolean isContactUsLinkExist() {
        // explicit wait - to wait for the compose button to be click-able
        //WebDriverWait wait = new WebDriverWait(driver,30);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#contact-link")));
        return driver.findElement(contactUs).isDisplayed();
    }

    public boolean isSignInLinkExist() {
        return driver.findElement(signIn).isDisplayed();
    }

    public boolean isForgetPwdLinkExist() {
        return driver.findElement(loginButton).isDisplayed();
    }

    public boolean isSignInButtonExist() {
        return driver.findElement(ForgotPassword).isDisplayed();
    }

    public AccountsPage doLogin(String uname, String pword){
        System.out.println("Login with : " + uname + " " + pword);
        driver.findElement(username).sendKeys(uname);
        driver.findElement(password).sendKeys(pword);
        driver.findElement(loginButton).click();
        return new AccountsPage(driver);
    }

}
