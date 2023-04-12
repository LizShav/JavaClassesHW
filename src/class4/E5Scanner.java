package class4;
//scanner is a class that contains all the logic to take the input from the user using console and the keyboard
//Why should we use scanner class? If we want to write interactive programs which can take input from users
//and based on that input we want to write a logic
//What is the Syntax of Scanner class: 1) create the object of the scanner class using
// : Scanner scanner=new Scanner(System.in );  2) once we have the object , we can call diff method for diff type of inputs
//Next()-when we have to take a string type of data from user we can use the next method
import java.util.Scanner;

public class E5Scanner {
    public static void main(String[] args) {
        //Scanner is a class(it knows how to take input from keyboard)
        //it is also a non-primitive type (just like String is also a non-primitive)
        //new=> is special keyword which creates an object of a class
        //after 'new'- we put Scanner(System.in)->which means we want to use the scanner class for taking the user input
        //whenever we need to take input from the user we need this code
        Scanner scan= new Scanner(System.in);
        System.out.println("Please enter your name");
        //Calling the next method to take a String from the user
        String name=scan.next();
        System.out.println("You are amazing "+name);

    }
}
