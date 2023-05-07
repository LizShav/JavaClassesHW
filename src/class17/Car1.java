package class17;
/*
1.Write a java class that will have a constructor: one with parameters and second without any parameters.
     Create a separate Test class where you will execute both of the constructors 1 by 1.(create 2 objects in test class)
 */
public class Car1 {
    String make;

    Car1() {
        System.out.println("without parameters");
    }

    Car1(String carMake) {//constructor 1 w/parameters
        make = carMake;
        System.out.println("1 argument constructor called");
    }
    void printInfo() {
        System.out.println(make);
    }


}
