package class14;
/*
Create a method that will take 2 parameters as a numbers and prints which number is larger
//since we're only to print , we use void method
 */

public class E7 {
    void isLarger (int num1, int num2) {
        if (num1>num2) {
            System.out.println(num1);
        }
        else {
            System.out.println(num2);
        }
    }

    public static void main(String[] args) {
        E7 obj = new E7();
        obj.isLarger(55,99);//we cannot assign int with void method
    }
}
