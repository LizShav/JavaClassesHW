package projectsJava;
/*
Write a program to swap 2 numbers without a
temporary variable?
 */
public class Task5ProjectDueApr22 {
    public static void main(String[] args) {
        int x = 10, y = 5;


        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After Swapping: x =" + x + ", y=" + y);

    }

    }

