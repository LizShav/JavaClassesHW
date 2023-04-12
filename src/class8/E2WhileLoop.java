package class8;

import java.util.Scanner;
  //ask the user to enter any numbers, it will ask to try again until user puts -1, then it will stop
public class E2WhileLoop {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter any number");
        int number=scanner.nextInt();
        while(number!=-1) {     //java will stop asking to try again as soon as the user enters -1
            System.out.println("Try again");
            number = scanner.nextInt();

        }










    }
}
