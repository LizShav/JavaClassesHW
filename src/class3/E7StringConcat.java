package class3;
//String Concatenation (combining strings with those data types will be combined together) "+" acts as concat ,
// not as an addition
public class E7StringConcat {
    public static void main(String[] args) {
        String firstName="Leo";
        String lastName="Neo";
        String fullName=firstName+lastName;
        System.out.println(fullName);

        String text=firstName+10; //int (10) combine with string(firstName)
        System.out.println(fullName);
        System.out.println(text);


    }
}
