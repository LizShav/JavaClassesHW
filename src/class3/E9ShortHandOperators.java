package class3;

public class E9ShortHandOperators {
    public static void main(String[] args) {

        int number=10; //we're requesting java to create container type int and store number 10 in it
        number=number+20;// pick whatever stored in number container and add 20 to that value and store the result
        //^^ normal way and below is shorthand

        System.out.println(number);

        int number2=10;
        number2+=20; //shorthand/shortcut
        System.out.println(number);
    }
}
