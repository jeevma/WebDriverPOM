package com.qa.opencart.factory;
import org.openqa.selenium.WebDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

/**
 *
 * Author Sanjiv Mathur
 * (Credit NaveenAutomationLabs)
 *
 */


public class DriverFactory {

    WebDriver driver;
    Properties prop;

    public WebDriver init_driver(String BrowserName) {
        if(BrowserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        else if(BrowserName.equals("firefox")) {
            WebDriverManager.firefoxdriver();
            driver = new FirefoxDriver();
        }
        else if(BrowserName.equals("safari")) {
            driver = new SafariDriver();
        }
        else {
            System.out.println("Please pass the correct browser name: " + BrowserName);
        }
    driver.manage().window().fullscreen();
    driver.manage().deleteAllCookies();

    return driver;
    }

    public Properties init_prop() throws FileNotFoundException {
        prop = new Properties();
        try {
            FileInputStream ip = new FileInputStream("src/test/resources/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }

}
