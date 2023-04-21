package class11;

public class E4D2ArrayString {
    public static void main(String[] args) {
        int[][] arr2D = {
                {10, 20, 30, 40, 50},
                {1, 2, 3, 4, 5},
                {5, 5, 5, 5, 5},
                {10, 8, 6, 4, 2}
        };
        for(int[] arr1D:arr2D){//it will take out each row and it will store inside arr1D variable/execute 4 times(because 4 rows)

            for(int num:arr1D)//after first execution it will have the numbers we have in a row 1 placed in "num" variable, then on on on
                System.out.println(num);
        }

    }
}
