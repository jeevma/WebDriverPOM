package sdet.qa.automation.testng;

import org.testng.annotations.*;

public class FifthTestCase {

    @BeforeTest
    void beforeTest(){
        System.out.println("This will execute before each Testcase");
    }

    @AfterTest
    void afterTest(){
        System.out.println("This will execute after each Testcase");
    }

    @Test
    void test5(){
        System.out.println("This is test5");
    }
}
