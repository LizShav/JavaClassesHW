package class17;

public class Car {
    String make;//instance variable
    String model;
    int engineCC;
    String color;
    Car(String make, String model, int engineCC, String color) {//same name for parameter and same name for variable, will not work because java confused
        this.make=make;//so we use keyword 'this', explicitly tell java that we're using instance variable
        this.model=model;
        this.engineCC=engineCC;
        this.color=color;
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }
    /*Car(String carMake, String carModel, int carEngineCC, String carColor) {
        make=carMake;
        model=carModel;
        engineCC=carEngineCC;
        color=carColor;
    }*/

    void printInfo(){
        System.out.println(make+" "+model+" "+engineCC+" "+color);
    }

    public static void main(String[] args) {
        Car car=new Car("Honda","Civic type R",1800,"white");
        car.printInfo();
    }
}
