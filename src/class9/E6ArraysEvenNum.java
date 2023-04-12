package class9;

public class E6ArraysEvenNum {
    public static void main(String[] args) {

        for(int i=0; i<=5; i++){
            if(i%2==0)//will print even numbers
            System.out.print(i+" ");

        }
        System.out.println();
        char [] chars={'a','b','c','d','e'};
                for(int i=0; i<chars.length; i+=2){

                        System.out.println(chars[i]);

                }
    }
}
