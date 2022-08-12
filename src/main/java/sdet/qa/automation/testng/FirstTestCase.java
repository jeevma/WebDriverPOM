package sdet.qa.automation.testng;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

/**
 * 1. Setup open browser and application
 * 2. login
 * 3. close
 */

public class FirstTestCase {

    @Test
    void setup(){
        System.out.println("This is the setup test");
    }

    @Test
    void login() {
        System.out.println("This is the login test");
    }

    @Test
    void teardown(){
        System.out.println("Close the browser");
    }

    @BeforeSuite
    void beforeSuite() {
        System.out.println("Run before suite");
    }

    @AfterSuite
    void afterSuite() {
        System.out.println("Run after suite");
    }

}
