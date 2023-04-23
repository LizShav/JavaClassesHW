package class12;
//startsWith Method
//sentence=sentence.trim().toLowerCase();
//String searchWord="Java";
//
public class E8StringDemo {
    public static void main(String[] args) {
        String sentence="Java is very very easy";
        //below is method chaining in String class.multiple methods on the same line
        sentence=sentence.trim().toLowerCase();//will trim spaces and convert the whole sentence to lower case
        System.out.println(sentence);
        System.out.println(sentence.startsWith("Python"));//false
        System.out.println(sentence.startsWith("Java"));//true

        String searchWord="Java";
        System.out.println(sentence.startsWith("java"));//true , no matter if lower or upper case


    }
}
