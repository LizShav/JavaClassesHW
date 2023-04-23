package class12;
//Empty method
public class E5StringDemo {
    public static void main(String[] args) {
        String name="   ";//""-no space isEmpty =true, "  "-space in between=false
        System.out.println(name.isEmpty());
        System.out.println(name.isBlank());//it checks the spaces "  " will be true unless there's character or letters
    }
}
