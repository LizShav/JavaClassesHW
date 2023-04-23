package class13;
/*
Pattern Method:ex str.replaceAll("[]","*")
[a-z]-lowercase- we can specify any range
[A-Z]-uppercase
[0-9]-numbers
Regular expressions, or regex for short, is a powerful tool used for pattern matching in text.
 They are used in programming languages and text editors to search, replace and manipulate text data.
  A regular expression is a sequence of characters that define a search pattern.
  It can be considered as a miniature programming language that is embedded inside another program or system.
 */
public class E2StringDemoPatternMethod {
    public static void main(String[] args) {
        String str="njkaSFDDTD12234!@#$%";
        System.out.println(str.replaceAll("[a-z]","*"));//all letter lowercase a-z replaced to *
        System.out.println(str.replaceAll("[A-Z]","#"));//cap letter replace with #
        System.out.println(str.replaceAll("[0-9]","%"));//numbers replaced with %
        System.out.println(str.replaceAll("[a-z0-9]","%"));
        System.out.println(str.replaceAll("[a-zA-Z]","%"));
        System.out.println(str.replaceAll("[A-z]","*"));
        System.out.println(str.replaceAll("[#-z]","%"));//only ! not replaced

        char c='A';
        c++;
        System.out.println(c);
        for (int i = 0; i < 10; i++) {
            System.out.print(c++ +" ");

        }

    }
}
