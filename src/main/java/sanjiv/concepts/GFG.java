package sanjiv.concepts;

import java.io.*;

public class GFG {
    // static variable
    static int a = 40;

    // instance variable
    int b = 50;

    void simpleDisplay()
    {
        System.out.println(a);
        System.out.println(b);
    }

    // Declaration of a static method.
    static void staticDisplay()
    {
        //access to class's static variable without using the class's object
        System.out.println(a);
        //Non static variable b can't be accessed from a static context
        //System.out.println(b);
    }

    // main method
    public static void main(String[] args)
    {
        GFG obj = new GFG();
        obj.simpleDisplay();

        // Calling static method.
        staticDisplay();
    }
}