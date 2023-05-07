package class17;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    //constructor below

    Dog(String dogName, String dogColor, String dogBreed, int dogAge){//constructor: no return type, name of method same as class
        name=dogName;
        color=dogColor;
        breed=dogBreed;
        age=dogAge;

    }

    void printInfo(){
        System.out.println(name+" "+color+" "+breed+" "+age);
    }

    //below is the normal way we would ha done
    /*public static void main(String[] args) {
        Dog dog=new Dog();
        dog.name="Jack";
        dog.color="black";
        dog.breed="lab";
        dog.age=5;
        dog.printInfo();

        Dog dog1=new Dog();
        dog1.name="Sam";
        dog1.color="brown";
        dog1.breed="lab";
        dog1.age=10;
        dog1.printInfo();

        Dog dog2=new Dog();
        dog2.name="Liane";
        dog2.color="white";
        dog2.breed="pomeranian";
        dog2.age=2;
        dog2.printInfo();

        Dog dog3=new Dog();
        dog3.name="Millie";
        dog3.color="cream";
        dog3.breed="poodle";
        dog3.age=6;
        dog3.printInfo();

        Dog dog4=new Dog();
        dog4.name="Mollie";
        dog4.color="grey";
        dog4.breed="husky";
        dog4.age=1;
        dog4.printInfo();
    }*/
}

