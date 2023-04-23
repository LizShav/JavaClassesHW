package class13;
//String- not mutable/not changeable
//StringBuilder- mutable/changeable
public class E6StringDemo {
    public static void main(String[] args) {
        String str="Wife";
        str.toLowerCase();//it wont change
        System.out.println(str);

        StringBuilder str2=new StringBuilder("Husband");
        str2.reverse();
        System.out.println(str2);
    }
}
