package class14;

public class E5TaskTester {
    public static void main(String[] args) {
        int [] arr={10,20,56};
        int number=20;
        taskE5ArrayUtils obj=new taskE5ArrayUtils();
        boolean result=obj.contains(arr,number);
        System.out.println(result);
    }
}
