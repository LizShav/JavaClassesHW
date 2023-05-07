package class16;

public class DogTester {
   public static void main(String[] args) {
      Dog dog1=new Dog();
      dog1.breed="German";
      dog1.color="black";
      dog1.name="Jack";

      Dog dog2=new Dog();
      dog2.breed="Persian";
      dog2.color="White";
      dog2.name="Sam";

      dog1.printInfo();
      dog2.printInfo();

      //static gets info from the class , not the object
      Dog.age=20;//using static int. But cant use with obj such as dog1 or dog2
      Dog.printInfo2();//we're calling it inside a different class so we add the class Dog
      dog1.age=30;//this won't work with object dog1,



   }
}
