package class4;

import java.util.Scanner;

public class E10Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your gender");
        char gender=scanner.next().charAt(0);//charAt(0)if F(0)E(1)M(2)A(3)L(4)E(5)-we ask java to use 0-character-F
        //There is no direct method for the char datatype in scanner class
        //we use a workaround we first use the next method to take a string from the user and
        //and from that string we extract the first letter by passing 0 to the charAt() method
        System.out.println("You entered "+gender);

  }
}
