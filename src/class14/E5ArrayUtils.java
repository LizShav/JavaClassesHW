package class14;

public class E5ArrayUtils {
    /*
    create a method call it contains, it should take an array of integers and an int number in the method body
    it should search the array for that number
    if number is present in the array method should return true, otherwise method
    should return false in a separate class call the method and test it for below
    input {10,20,45} number 20
    breakdown:
    1.name of method => contains
    2.parameters=> int[] arr, int num
    3.based on requirements ==> return type is boolean true/false
    4. body{}=> for loop with an If condition
    ex : boolean contains(int[] arr, int num){
    boolean isFound=false;
    for(int i=0; i<arr.length; i++){
    if(arr[i]==num){
    isFound=true;}}return isFound}
     */
    boolean contains(int[] arr) {
        int num=20;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==num){
                return true;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        E5ArrayUtils obj=new E5ArrayUtils();
        int [] arr={10,20,45};
        boolean result=obj.contains(arr);
        System.out.println(result);
    }
}
