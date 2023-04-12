package class7;

import java.util.Scanner;

public class E13WhileLoops {
    public static void main(String[] args) {
//ask the user for a number and then print all the numbers from 1 to that number
        Scanner scanner=new Scanner(System.in);//step 1. we use scanner that will allow us to ask the user for info
        System.out.println("Choose any numbers and enter it");//Step2.write what you want to ask from the user
        int num=scanner.nextInt();//Step3. depends on the data type in this case 'int' we need to include scanner next()
        int counter=1;//Step4. 1 means any #s will be greater than 1 it will print
        while(counter<=num){//Step5. whenever the # will be greater or equals to the # by user, it will print all the #s up to that number
            System.out.print(counter+ " ");
            counter++;//
        }
    }
}
