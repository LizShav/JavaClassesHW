package class13;
/*
Create a String that will hold a sentence. Write a program to get a new String without any spaces.
replaceAll(" ","")
 */
public class Task2 {
    public static void main(String[] args) {
        String str="   Today is a beautiful and sunny day";
        System.out.println(str);
        System.out.println(str.replaceAll(" ",""));


    }
}