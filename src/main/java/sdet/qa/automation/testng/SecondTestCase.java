package sdet.qa.automation.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SecondTestCase {

        @Test
        void setup_secTC(){
            System.out.println("Opening Browser");
        }

        @Test
        void searchCustomer() {
            System.out.println("This test is searching customer");
            Assert.assertEquals(1, 1);
        }

        @Test
        void addCustomer() {
            System.out.println("This test is adding customer");
            Assert.assertEquals(3, 3);
        }
        @Test
        void teardown_secTC(){
            System.out.println("Closing browser");
        }
}
