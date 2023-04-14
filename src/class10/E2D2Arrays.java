package class10;
//2DArray: 2nd way
//index size minus 1. ex:0,0,1,2. max index is 2 (0,1,2)
public class E2D2Arrays {
    public static void main(String[] args) {
        int[][] matrix=new int[3][3];//indexes are always size -1 , here 3 is size
        matrix[0][0]=10;
        matrix[1][1]=20;
        matrix[2][2]=50;
        //System.out.println(matrix[1][3]);this line is an error , max index for column 2
        System.out.println(matrix[2][1]);


    }
}
