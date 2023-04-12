package class5;

import java.util.Scanner;

public class replSolution {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter two strings");
        String string1=scanner.next();
        String string2=scanner.next();
        System.out.println("Please enter two numbers");
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();

        if(string1.equals(string2)&& num1==num2){
            System.out.println("AND");
        }else if(string1.equals(string2) || num1==num2){
            System.out.println("OR");
        }else {
            System.out.println("NONE");
        }


    }
}
