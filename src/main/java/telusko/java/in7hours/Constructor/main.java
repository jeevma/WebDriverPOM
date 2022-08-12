package telusko.java.in7hours.Constructor;

public class main {
    public static void main(String args []){

        UsingConstructor obj = new UsingConstructor(7); //constructor passing one parameter
        System.out.println(obj.num1);

        UsingConstructor withoutParameter = new UsingConstructor(); //default constructor picking default parameter
        System.out.println(withoutParameter.num1);

        UsingConstructor singleParameterTypeCast = new UsingConstructor(12.45); //constructor
        System.out.println(singleParameterTypeCast.num1);

        UsingConstructor adding2Nums = new UsingConstructor(10, 15); //constructor
        System.out.println(adding2Nums.addition(10, 15));
    }
}
