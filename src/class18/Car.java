package class18;

public class Car {
    String make;
    String model;
    String color;
    int year;
    int engineCC;
    Car(String make,String model, String color){
        this.make=make;
        this.model=model;
        this.color=color;
    }
    Car(String make,String model, String color,int year){
        this(make,model,color);//this line reuses variables from previous constructor on and on
        //1st line first object must fully be initialized before adding additional code.
        // Constructor first action is to initialize objects.
        this.year=year;
    }
    Car(String make,String model, String color,int year,int engineCC){
        this(make,model,color,year);
        this.engineCC=engineCC;
    }
}
