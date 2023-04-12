package class9;
//this example below is a version with a loop from e11Arrays
public class E12Arrays {
    public static void main(String[] args) {

        int [] numbers=new int[5];//this array has 5 lines
        int num=50;//starts with 50
        for (int i = 0; i < numbers.length; i++) {//index
            numbers[i]=num;//then numbers will be assigned to index 0 so it will be 50 that we assigned for int num
            num=num+10;//adds 10 to int num original number and prints whatever the result ex: 50 +10=60, next 60+10=70
        }

        for (int number : numbers) {
            System.out.println(number);
        }




    }
}
