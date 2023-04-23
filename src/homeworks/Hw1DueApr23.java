package homeworks;
/*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l
 */
public class Hw1DueApr23 {
    public static void main(String[] args) {
        String name = "Elizabeth";
        if (!name.isBlank()) {
            if (name.length() % 2 == 1 && name.length() >= 5) {
                System.out.println(name.charAt(4));
            }
        }
    }
}