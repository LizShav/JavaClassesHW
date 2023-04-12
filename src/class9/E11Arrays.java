package class9;
//There are 2 ways of creating arrays:
//1.all previous classes on Arrays
//2.this is the 2nd way below.->int[]=new int[];-means create an array of int with size 5
public class E11Arrays {
    public static void main(String[] args) {
        //new int[5];-means create an array of int with size 5
        int [] numbers=new int[5];
        numbers[0]=50;//store 50 on index 2
        numbers[1]=60;
        numbers[2]=70;
        numbers[3]=80;
        numbers[4]=90;
        for (int number : numbers) {
            System.out.println(number);

        }
    }
}
