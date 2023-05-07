package class17;

public class Person {
    String name;

    Person(){
        System.out.println("Constructor called from Person class with 0 parameters");
    }
    Person(String personName){
        name=personName;
        System.out.println("Constructor 2 with one argument/parameters"+personName);

    }
}
