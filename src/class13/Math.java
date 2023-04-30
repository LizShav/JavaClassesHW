package class13;

public class Math {
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    void multiply(int num3,int num4){
        System.out.println(num3*num4);
    }
    void divide(int num1,int num2){
        System.out.println(num1/num2);
    }
    void subtract(int num1,int num2){
        System.out.println(num1-num2);
    }

    public static void main(String[] args) {
       //create the object of Math class calling it math
        Math math=new Math();
        //next we calling the method and passing two values
        //addition
        math.add(10,10);
        //multiply
        math.multiply(10,10);
        //divide
        math.divide(100,20);
        //subtract
        math.subtract(30,15);
    }
}
