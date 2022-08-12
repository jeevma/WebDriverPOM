package sdet.qa.automation.testng;

import org.testng.annotations.*;

public class FourthTestCase {

    @BeforeClass
    void beforeClass(){
        System.out.println("This will execute before this class******");
    }

    @AfterClass
    void afterClass(){
        System.out.println("This will execute after this class.....");
    }

    @BeforeMethod
    void beforeMethod(){
        System.out.println("This will execute before every method");
    }

    @AfterMethod
    void afterMethod(){
        System.out.println("This will execute after every method");
    }

    @Test
    void test3(){
        System.out.println("This is test3---****---");
    }

    @Test
    void test4(){
        System.out.println("This is test4---####---");
    }
}
