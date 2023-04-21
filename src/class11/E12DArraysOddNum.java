package class11;
//Syntax1: data type [][] variableName= new data type[size-means how many element/size of row][size of columns];
//Syntax2:data type [][] variableName={{element1,element2, element3},
//                                      { element4, element5, element6}
//                                      };
//Task1 print Odd numbers from 2d array using nested loop
public class E12DArraysOddNum {
    public static void main(String[] args) {
        int [][] arr={{10,20,30,40,50},
                       {1,2,3,4,5},
                        {5,5,5,5,5},
                        {10,8,6,4,2}
        };
        //arr[row].length=> gives me an array at specific index by row

        for (int row = 0; row < arr.length; row++) {//it will go row by row
            for (int column = 0; column < arr[row].length; column++) {//arr[row here is index0,1,2,3,4 etc]
                int element=arr[row][column];//extracts the numbers stored by indexes in row and column
                if(element%2!=0){//2%!=0- is for the items stored inside of the rows and columns
                    //when we have to make selections out of the arrays. use if statement
                    System.out.print(arr[row][column]+" ");
                }

            }
            System.out.println();

        }

    }
}
