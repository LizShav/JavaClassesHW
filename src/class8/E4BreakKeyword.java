package class8;
//break keyword:exits the loop/break the look.
//can be used with and while/for loops
public class E4BreakKeyword {
    public static void main(String[] args) {


        int sum=0;//we declare this variable when we want the sum of the numbers
        for(int i=0; i<50; i++){
            sum=sum+i;
            if(sum>=300){
                System.out.println(i);
                break;//it stops the loop once the condition reaches false in an "if" condition. allowed in "if" or switch statements
            }
        }
    }
}
