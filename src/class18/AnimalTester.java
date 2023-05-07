package class18;
//testing the child class by creating an objects of those classes
//and used the methods such as voids
public class AnimalTester {
    /*
    create 5 classes of different animals like Cat, Dog, Zebra, Camel, Horse
    in each class create 5 field and 3 methods.
     */
    public static void main(String[] args) {
        Horse horse=new Horse();
        horse.color="Black";
        System.out.println(horse.color="Black");
        horse.eat();

        Cat cat=new Cat();
        cat.name="Mano";
        cat.sleep();
        cat.speak();
    }
}
