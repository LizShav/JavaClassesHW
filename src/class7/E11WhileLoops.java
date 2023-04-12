package class7;

public class E11WhileLoops {
    public static void main(String[] args) {
        //task1 print number from 100 to 1
        int numbers=100;
        while(numbers>=1) {
            System.out.print(numbers+ " ");
            numbers--;
        }
        //task2 print numbers from 20 to 100 even numbers
        numbers=20;
        System.out.println();//so we can see the next output on the next line
        while(numbers<=100){
            System.out.print(numbers+ " ");
            numbers+=2;// or could have used (numbers%2==0) in an if condition after curly while{}
        }
        //task3 print numbers 100 to 1 odd numbers
        numbers=100;
        System.out.println(numbers);
        while(numbers>=1){
            if(numbers%2==1)//its same is %2 !=0
            {
                System.out.print(numbers+ " ");
            }numbers--;
        }

    }
}
