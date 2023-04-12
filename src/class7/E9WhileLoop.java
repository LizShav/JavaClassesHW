package class7;

public class E9WhileLoop {
    public static void main(String[] args) {
        //print from 25 20 10 5 ,  missing 15 by using if condition !15-to not print it
        //counter!=10 && counter!15- means we wont see those two(if we put them in if condition)
        int counter=25;
        while(counter>=5){
            if(counter!=15)
                System.out.print(counter + " ");
                counter -= 5;


        }
    }
}
