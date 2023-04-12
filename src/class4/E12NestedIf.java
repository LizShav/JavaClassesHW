package class4;

public class E12NestedIf {
    public static void main(String[] args) {
        System.out.println("1");//not dependent on the if condition

        if(true){//if this condition will be true , then java check next 'If' and it will show whats in print,if false
            // it will show the false one , otherwise it will disregard the false statement
            System.out.println("2");
            if(false){
                System.out.println("3");
            }

        }
        System.out.println("4");//not dependent on the if condition
    }
}
