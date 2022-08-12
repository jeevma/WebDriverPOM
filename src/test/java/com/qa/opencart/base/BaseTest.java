package com.qa.opencart.base;

import com.qa.opencart.factory.DriverFactory;
import com.qa.opencart.pages.AccountsPage;
import com.qa.opencart.pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class BaseTest {
    //Create a driver factory reference
    DriverFactory df;
    //Create properties references with public keyword as its being used in other page test classes
    public Properties prop;
    //Create a WebDriver reference
    WebDriver driver;
    //Create the login page class reference as it could be used by multiple page class references - pointing to null, create the object
    //declare with public as child test classes extend the baseTest class and uses the variable reference
    public LoginPage loginpage;
    public AccountsPage accountsPage;

    @BeforeTest
    public void setUp() throws FileNotFoundException {
        //Initialize the driver factory object
        df = new DriverFactory();
        //call the properties initialize method and pass the reference to prop reference
        prop = df.init_prop();
        //Get the property from the config.properties file
        String browserName = prop.getProperty("browser");
        //call the driver initialize method and pass the reference to web-driver reference
        driver = df.init_driver(browserName);
        driver.get(prop.getProperty("url"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Create object of LoginPage class and pass the driver reference to the constructor
        loginpage = new LoginPage(driver);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
