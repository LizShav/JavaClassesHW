package class4;

import java.util.Scanner;

/*
3)You are DMV representative and you need to ask customer their age.
If they are 18 and older you will issue a driver license to them, otherwise you
will offer them to get a learners permit.
 */
public class HW3 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Are you 18 or older?Please only enter numbers");
        int age=scanner.nextInt();
        if(age>=18){
            System.out.println("We will issue a driver license for you");
        }else{
            System.out.println("We will offer a learner's permit");
        }
    }
}
