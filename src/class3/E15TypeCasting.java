package class3;
//convert double to int to avoid a decimal. basically we're forcing java to convert from one data type to another
//Syntax:it very rare that we will be doing type casting in real life
//at max you might convert double to an int to only get the whole number part
//ex double num=10.25122222;
//int num2=(int)num;=>10
public class E15TypeCasting {
    public static void main(String[] args) {

        double num=100.5;//double 100.5 converted to int which came down to 100because int doesn't have decimal
        int num2=(int)num;
        System.out.println(num2);

    }
}
