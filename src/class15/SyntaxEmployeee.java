package class15;
//done by teacher
public class SyntaxEmployeee {
    String empId;
    double salary;
    static String CEO="Sumair";

    public static void main(String[] args) {//creating objects
        SyntaxEmployeee asghar=new SyntaxEmployeee();
        asghar.empId="123456";
        asghar.salary=90000;
        //System.out.println(CEO);//not the preferred way
        System.out.println(SyntaxEmployeee.CEO );//preferred way with static, 99% this is used

        SyntaxEmployeee soheil=new SyntaxEmployeee();
        soheil.empId="55352268";
        soheil.salary=120000;
        System.out.println(SyntaxEmployeee.CEO);
        System.out.println(soheil.empId);
        System.out.println(asghar.empId);
        System.out.println(asghar.salary);
        System.out.println(soheil.salary);
    }
}
