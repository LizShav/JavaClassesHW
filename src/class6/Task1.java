package class6;
//else if and && operator
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter your height in inches");
        int height=scan.nextInt();




        if(height<60)
        {
            System.out.println("short");
        }else if(height>=60&&height<=72){
            System.out.println("medium");
        }else if(height>72)
        {
            System.out.println("Tall");
        }

    }
}
