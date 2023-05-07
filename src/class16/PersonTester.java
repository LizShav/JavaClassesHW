package class16;

public class PersonTester {
    public static void main(String[] args) {
        Person person=new Person();
        //person.password="hhhh";//gettin error because it is private in Person class
        System.out.println(person.SSN);//default access level can be accessed as loong as it is in the same package

    }
}
