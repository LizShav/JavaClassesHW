package class8;

public class E7Nestedloop {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {//we command java to print 3 times
            for (int j = 0; j < 5; j++) {//// command to print the numbers from 0 to 4(outer loop)
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
