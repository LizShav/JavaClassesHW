package class3;
/*

Relational Operators are some symbols that we use to perform comparison between data.
:">" greater ; "=" equal to ;
int num1=10;
int num2=20;
ex: num1>num2=> is 10 greater then 20 10>20=>false, is num1 value greater than num2's value(boolean data type)
ex2 num1==num2 => 10=20-answer false (is num1 is equal to num2)
ex3 num1!=num2 (is num1 not(!) equal to num2-true). 10!=20
ex4 num1>num2 or num1==num2 then we use for shortcut num1>=num2 (to check two conditions greater or equal to and its False)
 if one conditions will be true then it will be true )
 ex 5 num1<=num2 => num1<num2 (true) or num1==num2 (false) =>overall results are true

 */
public class E16ComparisonOperators {
    public static void main(String[] args) {
        int num1=10;
        int num2=20;
        boolean result=num1>num2; //false
        System.out.println(result);
        System.out.println(num1>num2);//false
        System.out.println(num1<num2); //true
        System.out.println(num1==num2);//false
        System.out.println(num1!=num2);//true
        System.out.println(num1>=num2);//false
        System.out.println(num2<=num1);//false
    }
}
