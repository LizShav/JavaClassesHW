package class7;

public class E10WhileLoops {
    public static void main(String[] args) {
        //print 1 to 13 numbers missing 3, 6, 9, 13
        int num=1;
        while(num<=13){
            if(num% 3 !=0) //we used Modulus % to eliminate the numbers that can divided by 3 and not equal to 0
            {
                System.out.print(num + " ");

            }num++;
        }

    }
}
