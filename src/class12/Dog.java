package class12;

public class Dog {//class Dog:category:descriptions .helps us define a generic template
    //below: properties/attributes/fields
    //creating a template here
    String name;
    int age;
    double weight;
    String color;
    String breed;
   boolean isAggressive;

    //below: actions/method/behaviour/functions
    void eat(){
        System.out.println("Dog is eating.......");
    }

    void bark(){
        System.out.println("Woof woof woof......");
    }
    void sleep(){
        System.out.println("zzZZzzzZZZzzzz");
    }
}
