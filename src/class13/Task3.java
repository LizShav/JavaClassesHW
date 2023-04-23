package class13;
/*
Create a String that should be combination of letters,
numbers and special characters.
 Find out how many Alphanumeric(abd AZ 284) characters are there in the String.
 */
public class Task3 {
    public static void main(String[] args) {
        String str="Sunday is for RELAXING1237422";
        String str1=str.replaceAll("[^A-z]","");
        System.out.println(str1);

        System.out.println(str1.length());
    }
}
