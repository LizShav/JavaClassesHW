package projectsJava;
/*
8. Maximum and minimum number in the array?
 */
public class Task8ProjectDueApr22 {
    public static void main(String[] args) {
        int[] numbers={1,15,23,30,40,63,85};
        int min;
        int max;
        max=numbers[0];
        min=numbers[0];
        for (int i = 0; i <numbers.length ; i++) {
            if(numbers[i]<min) min=numbers[i];
            if(numbers[i]>min) max=numbers[i];


        }
        System.out.println("The minimum number is "+min);
        System.out.println("The maximum number is "+max);
    }
}
