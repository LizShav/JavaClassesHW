package class4;
//for int -nextInt()
//for double- nextDouble()
//for boolean- nextBoolean()
//for char- there is no direct method , we use: next().charAt(0)-to extract first character from the word
//String (one word) - next()
//String (complete sentence) -nextLine()
import java.util.Scanner;

public class E8Scanner {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter your salary only numbers are allowed");
        //for Int type we should be using scanner.nextInt() method
        int salary=scanner.nextInt();
        if(salary>100000){
            System.out.println("You are rich");
        }else{
            System.out.println("Look for better opportunities");
        }
    }
}
