package class11;
//Task: with the help of loop count how many numbers in above array are even
public class E5DArrayEvenNumWithSum {
    public static void main(String[] args) {
        
        int [][] arr2D={{10,20,30,40,50},
                {1,2,3,4,5},
                {5,5,5,5,5},
                {10,8,6,4,2}
        };
        int counter=0;
        for (int[] arr1D : arr2D) {
            for (int num : arr1D) {
                if(num%2==0){
                    counter++;//counter will count condition which is if element is even number, if yes then goes through another element
                }
            }
            
        }
        System.out.println("counter = " + counter);
        
            }

        }
    

