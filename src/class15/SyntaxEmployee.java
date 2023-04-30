package class15;
/*
Create a Class called SyntaxEmployee:
Create three  variables  empID , salary and set the CEO to “Sumair”
Create two objects of the class SyntaxEmployee
Set the value of eID, salary for each of the objects
Print out the eID , salary and  CEO for each of the objects
 */
public class SyntaxEmployee {
    int empID;//instance , because different ids for each employee
    int salary;//instance, because salary is different as well
    static String CEO = "Sumair";// CEO is static because it stays the same

    public static void main(String[] args) {
        SyntaxEmployee employeeOne = new SyntaxEmployee();
        employeeOne.empID = 45632;
        employeeOne.salary = 100000;
        employeeOne.CEO = "Sumair";


        SyntaxEmployee employeeTwo = new SyntaxEmployee();
        employeeTwo.empID = 32453;
        employeeTwo.salary = 125000;
        employeeTwo.CEO = "Sumair";
    }
}
