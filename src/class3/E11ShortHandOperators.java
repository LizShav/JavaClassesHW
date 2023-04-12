package class3;
//Short hand operators allows us to perform operations by writing less code
//int num=2;
// num+=10; means add 10 to the previous value of num which is 2=> 10+2=12
// -= , += , /= , *= , %= , ++ , --
//++ means increase the value of variable by 1
public class E11ShortHandOperators {
    public static void main(String[] args) {
        int number=100;
        number=number+1;// number+1 increase the value of number by 1
        //number++;will be the same output as above
        double num=15.5;
        num++;
        float num3=11f; // if data type is double or float then it store decimal numbers=> 5.5
        num3/=2;

        System.out.println(num3);

        System.out.println(number);
        System.out.println(num);
    }
}
