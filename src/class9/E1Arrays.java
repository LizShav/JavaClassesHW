package class9;
/*
1.Arrays are collections of items/objects.We can store primitive and non-primitive inside arrays
2.Why should we learn about arrays?:they help us manage large amounts of data efficiently.We can process the data
stored in arrays using loops
Syntax:
String=> data type
[]-> this is a part of syntax
names->a variable name or name of the array
= -> assignment operator
{}->one of the ways to create arrays
 */
public class E1Arrays {
    public static void main(String[] args) {
        //Task1:We need to print many names using arrays(we can store millions of names in arrays)
        String[] names = {"Jacob", "Lean", "Pavel"};//java automatically assigns number to each name
        System.out.println(names[0]);
        System.out.println(names[2]);

        //task2: create an array of int and store numbers from 30,40,50,60,70,80,90
        //and access only 50
        int[] numbers = {30, 40, 50, 60, 70, 80, 90};
        System.out.println(numbers[2]);
    }


}



