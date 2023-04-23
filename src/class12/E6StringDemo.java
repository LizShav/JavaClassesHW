package class12;
//Equals method. Check if the name variable is equal to the string we're trying to print
//name.equals();   name.equalsIgnoreCase();   !name.equalsIgnoreCase();
public class E6StringDemo {
    public static void main(String[] args) {
        String name="Justin";

        System.out.println(name.equals("Axel"));//false
        System.out.println(name.equals("Justin"));//true
        System.out.println(name.equalsIgnoreCase("JUSTIN"));//true
        System.out.println(!name.equalsIgnoreCase("JUSTIN"));//false not equal to
    }
}
