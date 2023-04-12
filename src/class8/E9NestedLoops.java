package class8;

public class E9NestedLoops {
    public static void main(String[] args) {
        for (int i= 0; i <100 ; i++) {//java will run 100 times(outer loop)
            for (int star = 0; star < 10; star++) {//how many stars we want in one line(inner loop-tells us what we want to print)
                System.out.print("* " );
            }
            System.out.println();
        }
    }
}
