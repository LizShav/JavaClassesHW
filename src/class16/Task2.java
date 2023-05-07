package class16;
/*
Create a method that will take a String as a parameter and returns reversed String.
Method should be available to all classes within your project and accessible by class name.
 */
public class Task2 {
        // Function to reverse a string in Java
        public static String reverseString(String s){
//Converting the string into a character array
            char c[]=s.toCharArray();
            String reverse="";
//For loop to reverse a string
            for(int i=c.length-1;i>=0;i--){
                reverse+=c[i];
            }
            return reverse;
        }

        public static void main(String[] args) {
            System.out.println(reverseString("Hi All"));
            System.out.println(reverseString("Welcome to Edureka Blog"));
        }
}
