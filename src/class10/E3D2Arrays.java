package class10;
//matrix is 2D-array that contains 3 1D-arrays
public class E3D2Arrays {
    public static void main(String[] args) {
        int[][] matrix={
                //0  1  2
                {10,20,30},//row 0
                {20,50,65},//row 1
                {102,54,60}//row 2
        };
        int [] arr1=matrix[0];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }
        System.out.println();
        arr1=matrix[1];//we remove int[] because we don't want to declare the same array/or variable
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }
        System.out.println();
        arr1=matrix[2];
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+ " ");

        }
    }
}
