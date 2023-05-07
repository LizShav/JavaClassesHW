package class16;
/*
Create a method that will accept an array as parameters and will return a sum
of all elements from that array. Method should be visibly only within
same package and accessible by the creating an instance/object of the class.
 */
public class Task1 {
    int sumArray(int [] arr){ //method sumArr with array of integers
        int sum=0;
        //use enhanced loop
        for(int element:arr){
            sum=sum+element;
        }
        return sum;
    }

    public static void main(String[] args) {//calling the sumArr method
        Task1 task1=new Task1();
        int result=task1.sumArray(new int[]{10,10,10});
        System.out.println(result);

    }


}
