package class12;
//Trim method:   sentence.trim()
public class E7StringDemo {
    public static void main(String[] args) {
        String sentence="    Java is fun   ";//spaces included in this example , we want to remove them
        System.out.println(sentence);//spaces not removed
        System.out.println(sentence.trim());//spaces removed
    }
}
