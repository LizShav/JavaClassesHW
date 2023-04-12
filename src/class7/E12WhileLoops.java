package class7;

public class E12WhileLoops {
    public static void main(String[] args) {
        //add all the numbers from 1 to 10 and display result is 55

        int counter=1;
        int sum=0;
        while(counter<=10){
            sum=sum+=counter;//sum+=counter
            counter++;
            System.out.println(sum);
        }

    }
}
