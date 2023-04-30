package homeworks;
/*
Create a Class called Students
Create three  variables  Name , ID  and  numberOfStudents
Create three objects of the Students Class
Set the value for  studentName , studentID and increment  the numberOfStudents for each object
Print out  total number of students
 */
public class StudentsHW1dueMay6 {

        String name;
        String studentId;
        static int numberOfStudents;



    public static void main(String args[])
        {
            StudentsHW1dueMay6 students = new StudentsHW1dueMay6();

            students.name="Josh";
            students.studentId="12-30455";
            students.name="Helen";
            students.studentId="12-39455";
            students.name="Jen";
            students.studentId="12-38455";
            students.name="Sammy";
            students.studentId="12-37455";
            students.name="Melani";
            students.studentId="12-36455";
            students.name="Daniel";
            students.studentId="12-35455";
            for (int i = 0; i < students.name.length(); i++) {

            }

            System.out.println ("There are " + students.name.length() + " students in this class.");
        }
    }


