package class10;
/*
2D ARRAYS- Data in multidimensional arrays are stored in tabular form (in row major order).
 */
public class E1D2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                {10,20,30},//row 0
                {20,50,65},//row 1
                {102,54,60}//row 2
        };
        System.out.println(matrix[1][1]);//[index of row, index of column]
        System.out.println(matrix[1][2]);
        System.out.println(matrix[0][0]);


    }
}
