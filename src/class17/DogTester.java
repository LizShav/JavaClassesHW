package class17;
//with the help of a constructor
public class DogTester {
    public static void main(String[] args) {


//below code will create the object of The Dog class
        //passing parameters such as dogname, dogcolor etc in ()
        Dog dog1 = new Dog("jack", "black", "labrador", 5);
        Dog dog2=new Dog("shaggy","white","husky",8);
        Dog dog3=new Dog("Fluffy","pink","poodle",3);
        Dog dog4=new Dog("Mollie","yellow","persian",4);
        Dog dog5=new Dog("cooper","grey","german",3);
        dog1.printInfo();
        dog2.printInfo();
        dog3.printInfo();
        dog4.printInfo();
        dog5.printInfo();
    }
}
