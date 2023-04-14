package class10;

public class E52DArray {
    public static void main(String[] args) {
        int[][] matrix = {//2D Array
                //0   1   2   3   4 <-- indexes
                {10, 20, 30, 40, 50},//row 0, has 5 elements & 4 indexes
                {20, 50, 65,20},//row 1, has 4 elements & 3 indexes
                {102, 54, 60},//row 2, has 3 elements & 2 indexes
                {20, 55}//row 3, has 2 elements & 1 index
        };
        for (int irow = 0; irow < matrix.length; irow++) {//i- row
           // int[] arr=matrix[irow];//will give each complete row, basically 1d array extracting all elements from 2DArray
            for (int jcolumn = 0; jcolumn < matrix[irow].length; jcolumn++) {//j- individual elements from the row/under column
                //j<matrix[i] means will return the complete 1DArray at the index specified by the value of i
                System.out.print(matrix[irow][jcolumn]+ " ");

            }
            System.out.println();
        }
    }
}
