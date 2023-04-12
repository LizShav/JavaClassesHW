package class3;
//HW 3/25/23 #1
/*
Create a Java program and name it Double Comparison. Declare 2 double values and if value of first
variable is higher then the second, print “Double value ___is greater than ___.” Otherwise print
 */
public class DoubleComparison {
    public static void main(String[] args) {

        double num=10.2;
        double num2=10.3;
        if(num>num2)
        {
            System.out.println("Double number "+num+ " is greater than "+num2);
        }
        else
        {
            System.out.println("Double number "+num2+" greater than "+num);
        }

    }
}
