package class3;

public class E14TypeCasting {
    public static void main(String[] args) {

        short num=1200;//trying to put smaller size to a bigger one and it gives a negative only if we use (same type small)
        byte num2=(byte)num;//type casting-conversion of one data type to another
        System.out.println(num2);
    }
}
