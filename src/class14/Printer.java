package class14;

public class Printer {
    void printWord(String word){
        System.out.println(word);
    }
    /*
    Void- return type of the method , void means this method does not return any data
    other examples of return types can be String, in, boolean, char, Dog, Car etc..
    printWord- it's the name of the method
    (StringWord)- parameters/input, we can pass all the data types: strings..numbers...,no limit on parameters
    { System.out.println(word);}--> body of the method. You can write if else cond, loops,switch statements, variables of othe classes
     ...
     */



    public static void main(String[] args) {
        //we are creating an object of the E1Methods class
        //in java all the classes can be treated as data types
        //E1Methods();-> creating the object of E1Methods class
        Printer obj=new Printer();
        //below: we're calling the printWord() method on obj object and passing"java" as argument or input
        obj.printWord("Java");
    }
}

