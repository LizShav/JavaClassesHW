package class15;

public class E5Instance {
    String name;
    static int age=10;

    void print(){
        int age=10;
        System.out.println(age);
        System.out.println(name);
        System.out.println(age);//can be accessed static anywhere , no limitation
        System.out.println(Math.E);//declared in the math class
    }
    void printInfo(){
        System.out.println(name);
    }
    static void printName(){// static variable used with keyword "static"
        //System.out.println(name);//instance variables can only be used inside instance methods, not in STATIC
        System.out.println(age );//accessed from the very top static age=10;
    }

    public static void main(String[] args) {
        System.out.println(Math.E);//declared in the math class
    }
}
