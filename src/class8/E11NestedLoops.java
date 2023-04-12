package class8;

public class E11NestedLoops {
//starting point 2 , ending point 10 (even numbers)
    public static void main(String[] args) {
       /* for (int row= 0; row <5 ; row++) {
            int num = 2;
            while (num <= 10) {
                System.out.print(num + " ");
                num+=2;
            }

            System.out.println();
        }*/

        int counter=0;
        while(counter<4){
            for (int i = 2; i < 10; i=i+2) {
                System.out.print(i+ " ");

            }
            System.out.println();
            counter++;
        }
}
}