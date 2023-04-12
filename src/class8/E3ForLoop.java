package class8;

public class E3ForLoop {
    public static void main(String[] args) {
//write a loop to add all the even numbers from 1 to 10 for example from 1 to 7 even {2 4 6}=12
        int sum=0;//creating the variable to hold the sum

        for(int i=1;i<=10;i++){
            if(i%2==0){//checking the even number
                sum=sum+i;//or sum+=i. Adding all the even numbers to the sum variable one by one

            }

        }System.out.println(sum);//put it outside the if {} to get the sum not the running numbers. getting final result


    }
}
