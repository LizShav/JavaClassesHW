package class12;
//String Concatenation. Basicly combining
//ex:System.out.println(firstName.concat(lastName));
public class E4StringDemo {
    public static void main(String[] args) {
        String firstName="Ana ";
        String lastName="Tasevska";
        //String lastName=null;//null means store nothing
        String fullName=firstName+lastName;//mostly widely used approach, easy to read
        System.out.println(fullName);
        System.out.println(firstName.concat(lastName));//less used
    }
}
