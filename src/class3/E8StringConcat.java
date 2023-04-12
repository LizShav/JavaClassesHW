package class3;
//String concatenation allows us to attach two strings or one string with any other datat types
//String result="Messi"+10=>Messi10
//The result will always be a type of string and those two data types will be combined
//Normally Java executes the code from top to bottom, or left to right, however this
//ca be different if we use parenthesis, ow we are doing pure math calculations for exampl
//multiplication has precedence over addition and subtraction BODMAS(bracket open division multiplication adition subtraction
// ex 2+2*2=>6
// ex2 (2+2)*2=>8
// ex3 "Leo"+20+20=>Leo2020
// ex4 20+20+"Leo"=> 40Leo
// ex5 'leo"+(10+20)=>Leo30.
public class E8StringConcat {
    public static void main(String[] args) {
        System.out.println("Leo"+10+10); //concatination is happening here , the output result is Leo1010
        System.out.println(10+10+"Leo"); //first the addition happens then the concat of the number and name
        System.out.println("Leo"+10+10); //left to right rule works here
        System.out.println(2+2*2);//left to right rule doesn't apply to math only in the ()
        System.out.println((2+2)*2);//only if we use () inside the parenthesis. anything in brackets comes first
    }
}
