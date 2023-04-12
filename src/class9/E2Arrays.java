package class9;

public class E2Arrays {
    public static void main(String[] args) {
        //task: task2: create an array of int and store numbers from 30,40,50,90 and access only 50

        int[] numbers={30,40,50,90};//50 assigned aut by java under index 2

        System.out.println(numbers[2]);//to get the 50 out the numbers we use index 2 and it'll print as 50
//we can store negative numbers. Java will always assign an index to a number we try to store
        int[] numbersExample={30,-5,50,90};//index 0=30, 1=-5,2=50,3=90
        System.out.println(numbersExample[1]);
    }

}
