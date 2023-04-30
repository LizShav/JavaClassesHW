package class15;

public class E5LocalInstance {
    String name="Jimmi"; // INSTANCE Variable:inside class but outside main method

    void print(){
        int number=10;//LOCAL Variable: inside class and inside the void method
        System.out.println(number);
    }

    public static void main(String[] args) {
        E5LocalInstance e5=new E5LocalInstance();
        e5.print();

        if(true){
            int sum=0; // we can use the the same variable name in different block of codes , not in the same
        }
        switch("java"){//we can use the the same variable name in different block of codes
            case "a":
                int sum=0;
        }
        for (int i = 0; i < 10; i++) {
            int sum=0;///we can use the the same variable name in different block of codes
            for (int j = 0; j <5 ; j++) {
                //int sum=0;//we cannot re-declare in the same block of code
                System.out.println(sum);

            }

        }
    }
}
