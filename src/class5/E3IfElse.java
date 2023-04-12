package class5;

import java.util.Scanner;

public class E3IfElse {
    public static void main(String[] args) {

        /*
        ask the user for their age , and based on the value of age write an "if else" condition. If age is <less then
        <18 print you cant drive , otherwise we have to print  you can drive

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("How old are you?");
        int age=scan.nextInt();
        if(age<=18){
            System.out.println("You can't drive");
        }else{
            System.out.println("You can drive");
        }
    }

}
