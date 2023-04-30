package class14;

import homeworks.hwTask1DueApr29;

public class PalindromeTask {
    /*
    new StringBuilder(str)--> converts the String to a StringBuilder
    reverse()--> it reverses the contents in StringBuilder
    toString()-->it converts the StringBuilder back to String
    equalsIgnoreCase(str)comparing the reversed String to original one

     */
    boolean isPalindrome(String str) {
        return new StringBuilder(str).reverse().toString().equalsIgnoreCase(str);


    }
    public static void main(String[] args) {
        PalindromeTask task1=new PalindromeTask();
        boolean result=task1.isPalindrome("Madam");
        System.out.println(result);
    }
}