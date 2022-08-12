package sdet.qa.automation.testng;

import org.testng.annotations.Test;

public class DependencyExample {
    @Test
    void startCar(){
        System.out.println("Car Started");
    }

    @Test(dependsOnMethods = "startCar")
    void driveCar(){
        System.out.println("Car driving");
    }

    @Test
    void stopCar(){
        System.out.println("Car Stopped");
    }

    @Test
    void parkCar(){
        System.out.println("Car Parked");
    }

    @Test
    void reverseCar(){
        System.out.println("Car Reversed");
    }

}
