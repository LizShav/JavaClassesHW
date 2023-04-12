package class9;
/*
Enhanced for loop-designed for arrays to make it easier to get all the values
 */
public class E9ArraysEnhancedForLoop {
    public static void main(String[] args) {
        //Enhanced for loop:we cant use reverse in this loop. only can print in the order it was written in forward
        String [] confusedStudent={"Vlad","Veronica","Farwa","Halima","Lias"};

        for(String name:confusedStudent){
            System.out.println(name);
        }
    }
}
