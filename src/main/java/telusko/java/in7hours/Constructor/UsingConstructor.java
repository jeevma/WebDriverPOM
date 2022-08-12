package telusko.java.in7hours.Constructor;

public class UsingConstructor {
         //knows something - attributes/variable
        int num1;
        int num2;
        int result;
        //does something - behavior/methods
    public int addition(int n1, int n2){
        this.num1 = n1;
        this.num2 = n2;
        int sum = num1 + num2;
        return sum;
    }

    //Constructor without any parameters
    public UsingConstructor(){
        num1 = 5;
        num2 = 10;
        System.out.println("In constructor without parameter");
    }

    public UsingConstructor(int n) {
        num1 = n;
        System.out.println("In constructor with one parameter");
    }

    public UsingConstructor(double d) {
        num1 = (int) d;  //type cast double to int
        System.out.println("In constructor with one parameter type casting to int from double");
    }

    public UsingConstructor(int n1, int n2) {
        System.out.println("In constructor with two parameter");
    }

}
