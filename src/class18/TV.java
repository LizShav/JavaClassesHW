package class18;
//private modifiers methods cannot be inherited
//protected modifiers can be accesses through inheritance through different classes through different packages
public class TV {
    private int size;//can only be accessed in the same class. modifier private
    String make;//modifier default
    String model;

}
class AppleTV extends TV{

}
class TVTester{
    public static void main(String[] args) {
        TV tv=new TV();
    }
}