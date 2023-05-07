package class16;

import java.util.Scanner;

public class Person {
    public String name="Vlad";//public can be accessed as long as it is in the same PROJECT
    String SSN="797853";// this is default access level
    private String password;//keyword private , no other class in your project will be able to access it
    private static double bankBalance=12000;
    private void printPassword(){
        System.out.println(password);
    }
    private static void printBalance(){
        System.out.println(bankBalance);
    }

    public static void main(String[] args) {
        Person farwa=new Person();
        farwa.password="12345";
        farwa.printPassword();//in the same class , we can access private fields,private methods
        System.out.println(Person.bankBalance);
        System.out.println(farwa.SSN);
        System.out.println(farwa.name);

    }
    //public class Cat{} in the same file we CAN'T create two classes
}
