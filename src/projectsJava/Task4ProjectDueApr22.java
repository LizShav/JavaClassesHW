package projectsJava;
/*
Create a 2D array of integers. Develop a program
which will calculate the sum of even and odd numbers
for that array.

 */
public class Task4ProjectDueApr22 {
    public static void main(String[] args) {
        int[][] array = {{12,-12,56,78},{30,67,55},{64,69}, {32,40,46,61}};
        int sumOdd=0;
        int sumEven=0;
        int num;

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j < array[i].length; j++) {
                num=array[i][j];
                if(num%2==0){
                    sumEven+=num;

                }else{
                    sumOdd+=num;
                }


            }

        }
        System.out.println("Sum of even is:"+sumEven);
        System.out.println("Sum of odd numbers is:"+sumOdd);

    }
}
