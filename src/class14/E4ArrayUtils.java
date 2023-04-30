package class14;

public class E4ArrayUtils {
    /*
    create a method to add two int numbers and it should return the results back when called
    name of the method add
     BreakDown:
     1.returnType=> int
     2.name of the method=> add
     3. parameters()=> (int a,int b)
     4. body of the method=> {}
     int sum=a+b;
     return sum;
     */

    int add(int a,int b) {
        int sum=a+b;
        return sum;
    }

    public static void main(String[] args) {//main method
        E4ArrayUtils obj=new E4ArrayUtils();//creating the object of the "E4ArrayUtils" class
        //below: we are calling "add" method on "obj" object, passing two arguments one is 10 , other 20
        //and storing the results from method called into the "sum" variable
        int sum=obj.add(10,20);//storing results of int a, b in  sum variable
        System.out.println(sum);
    }

}
