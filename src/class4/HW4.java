package class4;

import java.util.Scanner;

/*
4)Create a Java program that will ask user to input city and temperature.
Your program should convert Fahrenheit into celsius and print “The temperature is
the city __ is __”
 */
public class HW4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Please enter your City");
        String name=scan.next();

        System.out.println("Please enter your current Temperature");
        int temp=scan.nextInt();
        int tempC=(temp-32)*5/9;
        System.out.println("Your City is "+name+" and the temperature is "+tempC+ " degrees in Fahrenheit");
    }
}
