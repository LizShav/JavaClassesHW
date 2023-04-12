package class2;

public class WholeNumbersDemo {

    public static void main(String[] args) {
        /*
        byte=> data type
        age=>variable, boxes in the memory where the data is stored
        = => means store the number in the variable
        50=> is the number we want to store
        ; => part of the syntax just like in english we end a sentence with .We end a line in java with ;
         */

        byte age=100;
        System.out.println(age);
        /*
        for variable for the name we start with lowercase the rest of the words with capital
         */
        short noOfApples=300;
        System.out.println(noOfApples);
        int bankBalance=1000000;
        System.out.println(bankBalance);
        /*
        all the whole long numbers by default they are treated as int whenever we have to store a number
        which is beyond the range of int we have ti explicitly write the letter 'L' or 'l' at the end to tell java
        we are dealing with a special very large number. Mostly 99% of the time we wil be using 'int' in real life
         */
        long paidTimeOff= 1_234_567_890l;
        System.out.println(paidTimeOff);




    }
}
