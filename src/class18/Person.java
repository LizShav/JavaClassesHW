package class18;
//Multiple Hierarchy classes example below employee and tester inherited string name from the Person class
public class Person {
    String name;
    void sleep (){
        System.out.println("ZZZZzzzzzzZZZZzzzzz");
    }

}

class Employee extends Person{

}

class Tester extends Employee {


}
class PersonTester{

    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.sleep();
        Tester tester=new Tester();
        tester.name="Sarah";
        tester.sleep();

    }
}