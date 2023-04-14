package class10;
/*
when we need to repeat the code we should replace the code with a loop
 */
public class E42DArraysWithLoop {
    public static void main(String[] args) {
        int[][] matrix = {//2D Array
                //0  1  2
                {10, 20, 30},//row 0
                {20, 50, 65},//row 1
                {102, 54, 60}//row 2
        };
        for (int j = 0; j < 3; j++) {
            //j<3 indicates there are 3 rows.^^getting the complete 1DArray from 2DArray
            int[] arr1 = matrix[j];//nested loop , we entered [j] and printed all rows and columns
            for (int i = 0; i < arr1.length; i++) {
                //^^going over all the elements from 1SArray
                System.out.print(arr1[i] + " ");

            }
            System.out.println();//to print all rows on a new line

        }
    }
}

