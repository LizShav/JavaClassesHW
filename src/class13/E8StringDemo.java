package class13;
/*
when it is best to use String in comparing to StringBuilder?
when you have a small number of string manipulations and do not need to perform the operation frequently.
 It is best to use a String when you only need to perform a few operations on it.
 */
public class E8StringDemo {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("1");
        for (int i = 0; i < 100; i++) {
            str.append(1);//str+=i-we converted from string to stringbuilder
            System.out.println(str);


        }
    }
}
