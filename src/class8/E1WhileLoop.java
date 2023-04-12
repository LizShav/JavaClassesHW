package class8;


import java.util.Scanner;
//Task-print all the numbers from start point to an ending point
//as the user for starting and ending number
public class E1WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);//always the same words
        System.out.println("Please enter the starting and the ending point");//right after scanner we ask the user for input
        int startCounter=scanner.nextInt();//asking user for start number ex 5

        int endCounter=scanner.nextInt();//asking user for end number ex 20


        int number=startCounter;//number is basically starting point

        while(number<=endCounter){//
            System.out.print(number+ " ");
            number++;

        }
    }



}
