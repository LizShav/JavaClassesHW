package class7;

import org.w3c.dom.ls.LSOutput;

public class Hw4Saturday {
    public static void main(String[] args) {
        //Task 4 Print odd numbers from 20 to 50(2ways)
        int oddNum=21;
        while(oddNum<50){

                System.out.print(oddNum+ " ");
            oddNum+=2;
        }
        System.out.println();
        for(int i=21;i<50;i+=2 ){
            System.out.print(i+ " ");
        }
    }

}
