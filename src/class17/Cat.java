package class17;
/*Cat(){    <-when we do not create  constructor in a class, java automatically creates a default constructor
 behind the scenes. this constructor doesnt take parameters
        }*/
public class Cat {
    String name;//instance variable
    Cat(String catName){//constructor 1 w/parameters
        name=catName;
        System.out.println("1 argument constructor called");
    }
    Cat(String name, String collor){
        System.out.println("2 arguments constructor");//java will know by the numbers of parameters

    }

    Cat(int age){//3rd constructor
        System.out.println("int argument constructor");
    }
    Cat(){//constructor 2 w/out parametrs
        System.out.println("0 argument constructor called");

    }
    Cat(double weight){
        System.out.println("double argument constructor");//4th constructor if we put Cat cat=new Cat(10.5)
    }
    //Cat(String color)- error because string is already defined in 1st , we have to pass all strings in one constructor


    void printInfo(){
        System.out.println(name);
    }


    public static void main(String[] args) {
        Cat cat=new Cat("tanji");//Cat cat=new Cat()<- it will print the 2nd constructor,Cat cat=new Cat(3)<-will be 3rd constructor
        cat.printInfo();
    }

}
