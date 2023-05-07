package homeworks;

import class18.D;

/* DUE Saturday May 13th, 2023
Write a Java program called Teacher.  Identify features and 4 behaviour of that Class.
Create 3 subclasses MathTeacher, ChemistryTeacher and PianoTeacher . Test all 4 classes
 */
public class Teacher {
    String name;
    int age;
    boolean Engaging;
    boolean patience;
    void teaching(){
        System.out.println(" is teaching students");
    }
    void eat(){
        System.out.println(" eating lunch in  between the classes");
    }
    void vacation(){
        System.out.println(" allowed summer days off ");
    }
    void school(){
        System.out.println(name+" teaching in High School");
    }

}
class MathTeacher extends Teacher{

}
class ChemistryTeacher extends Teacher{

}
class PianoTeacher extends Teacher{

}
class TeacherTester{
    public static void main(String[] args) {
        MathTeacher math=new MathTeacher();
        System.out.println(math.name="Jane Smith");
        math.age=30;
        math.Engaging=true;
        math.patience=true;
        math.teaching();math.eat();math.vacation();math.school();
        System.out.println();


        PianoTeacher piano=new PianoTeacher();
        System.out.println(piano.name="Dorothy Cooper");
        piano.age=50;
        piano.Engaging=true;
        piano.patience=true;
        piano.teaching();piano.eat();piano.vacation();piano.school();
        System.out.println();

        ChemistryTeacher chemistry= new ChemistryTeacher();
        System.out.println(chemistry.name="Jim Cooper");
        chemistry.age=45;
        chemistry.Engaging=true;
        chemistry.patience=false;
        chemistry.teaching();chemistry.eat();chemistry.vacation();chemistry.school();
        System.out.println();



    }
}