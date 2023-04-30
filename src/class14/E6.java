package class14;

public class E6 {
    /*
    create a method which retursn true or false and takes an int
    number as a parameter if number is even
     it return true otherwise it returns false
    name isEven
     */

    boolean isEven(int num){
       /* boolean isEven=false; // longer way
        if(num%2==0){
            isEven=true;
        }return isEven;*/
        return num%2==0;// shorter way
    }

    public static void main(String[] args) {
        E6 test=new E6();
        boolean test1 = test.isEven(20);
        System.out.println(test1);
    }
    }

