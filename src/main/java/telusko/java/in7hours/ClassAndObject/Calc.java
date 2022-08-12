package telusko.java.in7hours.ClassAndObject;

class Calc {
//knows something - attributes/variable
    int num1;
    int num2;
    int result;
//does something - behavior/methods
    public int perform(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
        return result = num1 + num2;
    }


    public static class ObjectDemo {
        public static void main(String args[]) {
            Calc obj = new Calc();  //constructor
            System.out.println(obj.perform(10,15));
        }
    }
}
