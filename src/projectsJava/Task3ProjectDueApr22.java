package projectsJava;
/*
3. Create a 2D array or integer type where you will store
odd and even numbers. Develop a program which will
identify/print the even numbers only.
 */
public class Task3ProjectDueApr22 {
    public static void main(String[] args) {
        int[][] arr = {{2, 3, 6, 9, 10},
                     {20, 40, 53, 57, 43}
        };

        for (int row = 0; row < arr.length; row++) {
            for (int column = 0; column < arr[row].length; column++) {
                int element = arr[row][column];
                if (element % 2 == 0) {
                    System.out.print(arr[row][column] + " ");

                }
            }
        }
    }
}




