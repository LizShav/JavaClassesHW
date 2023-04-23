package class12;//<--the name of a package
//in the testers classes we always use main method
//creating an object of a class(dog template)
//building here
public class DogTester {
    public static void main(String[] args) {
        Dog actualDog= new Dog();
        actualDog.name="Jacky";
        actualDog.age=50;
        actualDog.breed="German";
        actualDog.color="Black";
        actualDog.weight=50;

        actualDog.bark();

        Dog obj=new Dog();
        obj.name="Sammie";
        obj.age=15;
        obj.breed="Shiba Inu";
        obj.color="orange";
        obj.weight=20;
        obj.isAggressive=false;

        obj.eat();

    }
}
