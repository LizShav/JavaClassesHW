package class5;

import java.util.Scanner;

public class E2If {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);//this code helps us get any type of data from the console
        System.out.println("Is It time for break true/false");//it will print the text inside "" in the console
        boolean isbreak=input.nextBoolean();//we are creating a variable of type boolean, naming it isBreak
        //input-means variable of type scanner, nextBoolean()-method that helps us boolean type data from the keyboard
        //= sign will store that value inside isBreak variable
        if(isbreak)// we put boolean variable to check if its true , if yes it will show the text in the console
        {
            System.out.println("Let's have a break");
        }else//if we answer in console to this ^^ as false then below statement will print
        {
            System.out.println("Lets continue the class");
        }

    }
}
