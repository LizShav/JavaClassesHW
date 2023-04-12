package class3;
/*
if condition /variable (true) it will execute/print , if (false) after execution it won't show.
Java checks whatever you put in () and executes either its true or false. We can use all the variables for these statements
 */
public class E17ifElseStatements {
    public static void main(String[] args) {

        if(false)
        {
            System.out.println("Batch 16 is doing really great");

        }

        boolean condition=false;

        if(condition){
            System.out.println("Java is easy");
        }

        int age=19;
        if(age>18){
            System.out.println("You are allowed to vote");
        }
    }
}
