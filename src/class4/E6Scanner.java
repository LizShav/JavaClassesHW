package class4;

import java.util.Scanner;

public class E6Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter you name");
        String name=scanner.next();
        if(name.equals("Elina")) {
            System.out.println("Mac User");
        }else{
            System.out.println("Windows User");
        }
    }
}
