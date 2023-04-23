package class12;

public class CarTester {
    public static void main(String[] args) {
        Car car= new Car();
        car.make="Toyota";
        car.model="Camry";
        car.color="White";
        car.mileage=0;
        car.isAutomatic=true;
        car.year=2022;
        car.price=25000;

        car.startCar();
        car.drive();
        car.stopCar();

        Car car1=new Car();
        car1.make="Tesla";
        car1.model="S";
        car1.mileage=15000;
        car1.isAutomatic=true;
        car1.startCar();
        car1.drive();
        car1.Music();
        car1.stopCar();




    }
}
