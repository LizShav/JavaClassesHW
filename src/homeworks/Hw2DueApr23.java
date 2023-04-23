package homeworks;
/*
Create a String and print it in reverse order (Sunday → yadnuS).
 */
public class Hw2DueApr23 {
    public static void main(String[] args) {
        String name = "Elizabeth";
        for (int i = name.length() - 1; i >= 0; i--) {
            System.out.print(name.charAt(i) + " ");
        }
    }
}