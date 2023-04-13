package homeworks;
/*
from an array of integers finds the largest number
logic: create a variable to store the larges #
go through all the numbers from array one by one
compare the largest number with al the numbers in the array

 */
public class hw7DueApr15 {
    public static void main(String[] args) {
        int[] numbers={10,20,50,40,30};
        int largeNum=numbers[0];
        for (int number : numbers) {
            if(number>largeNum){
                largeNum=number;
            }
            


        }System.out.println(largeNum);

    }
}
