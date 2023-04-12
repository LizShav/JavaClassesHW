package class4;

public class E2ifElseStatement {
    public static void main(String[] args) {
        // String/or any other non-primitive data types we cannot use == sign
        //instead we can use if (name.equals("whatever name /value goes here))
        String name="Jacob"; // if we put the same name in if() then will be considered true, if different name-false
        if(name.equals("Jack"))
        {
            System.out.println("I like swimming");
        }
        else
        {
            System.out.println("I like programming");
        }
    }
}
