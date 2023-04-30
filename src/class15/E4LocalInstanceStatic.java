package class15;
//a variable that is given local scope.
// A local variable reference in the function or block in which it is declared
//ex: inside loop, switch statement, if condition
public class E4LocalInstanceStatic {
    static int age; //STATIC VARIABLE -all instance variable with keyword static

    public static void main(String[] args) {
        if(10>20){
            int sum=10;//local to if condition
            System.out.println(sum);//that's why sum goes inside if{}
        }
        //System.out.println(sum); if we put it outside{} it wont work , due to its being local variables
        //that goes in side the curly brackets
    }
    String name; //INSTANCE VARIABLE -outside of the method

    static String year;// STATIC VARIABLE  not inside a method but inside a class can be look by {}
}
