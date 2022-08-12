package sdet.qa.automation.testng;

import org.testng.annotations.Test;

public class PriorityExample {


    @Test(priority = 1)
    void testOne(){
        System.out.println("This is test1....");
    }

    @Test(priority = 2)
    void testTwo(){
        System.out.println("This is test2...");
    }

    @Test(priority = 3, enabled = false)
    void testThree(){
        System.out.println("This is test3...");
    }

    @Test(priority = 4)
    void testFour(){
        System.out.println("This is test4...");
    }
}
