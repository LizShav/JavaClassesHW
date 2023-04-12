package class3;

public class E13TypeCasting {
    public static void main(String[] args) {
        //byte=>short=>int=>long=>float=>double (from small to largest numbers stored)
        byte num=127; //from a smaller box(byte) to a larger box(short)
        short num2=num;
        System.out.println(num2);

        int num3=1111120;// what we are doing we convert one data type to another ( smaller to a larger one)
        double num4=num3;
        System.out.println(num4);
    }
}
