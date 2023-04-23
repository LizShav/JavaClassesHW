package class12;
//String Method Length!
public class E1StringClassDemo {
    public static void main(String[] args) {
        //create the object of that class
        //Syntax: ClassName objectname=new ClassName();
        //ex:scanner scanner=new Scanner(System.in)
        //string class was developed by java programmers
        //String s=new String("Ana");//actual
        String string1="Ana";//shortcut. Most widely used one.Object created , now we do behaviours below
        System.out.println(string1.length());//will execute 3, means 3 letters /characters in the name mentioned

        String name="Justin Chukwudiuche";
        if(name.length()>8){
            System.out.println("Only 8 characters are allowed");
        }
    }
}
