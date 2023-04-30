package class14;

public class E2ArrayManipulator {
    /*
    Create a method that will take an int array call it sumArr and return the sum of all the elements
    from that array. Create the obj of the class and call the method
   break it down : return type :INT , name of the method : sumArr , parameters-(int [] arr),
   {} go through all the elements of the array add them and return the results
   for (int num : arr) {sum+=num;}
   ex:Scanner  scanner=new Scanner(System.in);-a class,that has methods in a class such as nextInt(), next();
            int age=scanner.nextInt();-calling a class, to store it in a variable

    */
    int sumArr(int[] arr){
        int sum=0;
        for (int i = 0; i <arr.length ; i++) {//or enhanced loop:for (int num : arr) {sum+=num;}
            sum=sum+arr[i];

        }
        return sum;


    }

    public static void main(String[] args) {
        E2ArrayManipulator obj=new E2ArrayManipulator();
        int [] array={10,20,30};
        int result=obj.sumArr(array);
        System.out.println(result);


    }
}
