package class15;
//static -we use when we want to share across everyone
public class Dog {
    String name;
    String color;
    int age;
    static double weight;
    static String planetName="Earth";

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.color="green";
        dog.weight=20;


        Dog dog1=new Dog();
        System.out.println(dog1.weight);//static:class the same , different object dog1.
        // both object accessing the same variable. Universal/Global

        System.out.println(dog1.color);//instance, no execution, cannot be shared between different objects
    }
}
