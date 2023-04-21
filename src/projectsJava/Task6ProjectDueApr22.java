package projectsJava;
/*
6. Write a java program to check whether a given
number is prime or not?
prime number is dividable by  and itself , num is greater than 1, num divisible by itself
 */
public class Task6ProjectDueApr22 {
    public static void main(String[] args) {
        int num=15;
        boolean isPrime=true;
        if(num>1){

            for (int i = 2; i < num; i++) {
                if(num%i==0){
                    isPrime=false;
                    break;

                }
            }
        }
        if(isPrime){
            System.out.println(num+ " is a Prime number");
        }else{
            System.out.println(num+ " is an not a prime Number");
        }



    }
}



