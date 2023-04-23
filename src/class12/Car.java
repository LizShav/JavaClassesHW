package class12;

public class Car {
    //define 5 properties and 3 methods
    String make;
    String model;
    String color;
    int mileage;
    boolean isAutomatic;
    int year;
    int price;


    void startCar(){
        System.out.println("Starting "+make+" engine");
    }
    void stopCar(){
        System.out.println("Applying the breaks to stop the car");
    }
    void drive(){
        System.out.println("Drive to shopping mall....");
    }
    void Music(){
        System.out.println("Playing radio 102.7FM");
    }
    void AC(){
        System.out.println("Turn on AC");

    }
    void move(){
        System.out.println("Starting an engine");
    }
    void breaks(){
        System.out.println("Push on a break");
    }

}
