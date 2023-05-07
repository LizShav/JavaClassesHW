package class18;

public class Dog {
    String name;
    String color;
    String breed;
    int age;
    double weight;

    Dog(String name,String color,String breed, int age, double weight){
       /*this.name=name;
        this.color=color;
        this.breed=breed;
        this.age=age;*/
        //instead typing all above , below we use this line
        //basically calling a constructor from the same class which takes name, color, breed, age as parameter
        this(name, color, breed, age);
        this.weight=weight;
    }
    //to provide with flexibility , if someone doesn't know the weight for example, so
    //create another constructor in the same class , and just remove lets just say weight .
    Dog(String name,String color,String breed, int age){
        /*this.name=name;
        this.color=color;
        this.breed=breed;*/
        this(name,color,breed);
        this.age=age;

    }
    Dog(String name,String color,String breed){
        this.name=name;
        this.color=color;
        this.breed=breed;


    }
    void eat(){
        System.out.println("eating....");
    }
    void sleep(){
        System.out.println("sleeping....");
    }
    void speak(){
        System.out.println("woof woof...");
    }
}
