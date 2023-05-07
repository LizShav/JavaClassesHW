package class18;

public class D {
    static void printF(){
        System.out.println("printing");
    }
}
class E extends D{

}
class ETester{
    public static void main(String[] args) {
        D d=new D();
        d.printF();
    }
}