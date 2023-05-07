package class16;

public class Dog {
    String name;//instance variable
    String color;//instance variable
    String breed;//instance variable
    static int age;

    void bark(){//void method
        System.out.println(name+ " is barking");
    }
    void printInfo(){//void method w/if statement
        if(breed.equals("German")){
            System.out.println(name+ " his color is "+color+ " he can work in NYPD");
        }else{
            System.out.println(name+ " can be used as a pet");
        }
    }
    static void printInfo2(){//in static method we can use local variable , not instance ones
        if(age<10){
            System.out.println("young dog");
        }else{
            System.out.println("Old dog");
        }

    }

    public static void main(String[] args) {
        printInfo2();//both STATIC methods are present inside the class

    }
}
