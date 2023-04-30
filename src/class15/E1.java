package class15;

import class14.E2ArrayManipulator;

import java.util.Arrays;

public class E1 {
    /*The createArray(size) method takes an integer parameter size and creates an array of that size
    Then it fills the array with the number 10 using a FOR LOOP, and finally returns the array
    */
    //createArray(5)=>{10,10,10,10,10}
    //createArray(3)=>{10,10,10}

    //below step 1:return type is array with int type-> int[],name:createArray, parameters(int size)
    int[] createArray(int size) {
        //below step2:creating an array int[] array=new int[size-because we dont know what size user will choose];
        int[] array = new int[size];
        //below step3:using FOR LOOP we can use i<size or array.length
        for (int i = 0; i < size; i++) {
            //below step4: filling the array , storing the number 10
            array[i] = 10;
        }

        return array;
    }

    public static void main(String[] args) {

        E1 e1 = new E1();
        int[] array=e1.createArray(5);//pass an integer which is 5 in this case
        //System.out.println(Arrays.toString(array));

        //for (int i : array) { // or using an enhanced loop type iter+enter
            //System.out.println(i);
        for (int i = 0; i < array.length; i++) { // or use a for loop
            System.out.println(array[i]);

        }

        }


    }





