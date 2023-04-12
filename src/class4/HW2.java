package class4;

import java.util.Scanner;

/*
2) You are a loan specialist and you need to ask user what is the amount of loan
is needed. If loan is less or equal to 200,000 then you would lend the money
otherwise you would reject the client.
 */
public class HW2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("What is the amount of a loan do you need?");
        int loanAmount=scanner.nextInt();
        if(loanAmount<=200000){
            System.out.println("We would lend you the money");
        }else{
            System.out.println("You are rejected");
        }
    }
}
