package class9;
//numbers.length- if we want java automatically counts {how my numbers we entered in an array}

public class ExampleArrayswithloop {
    public static void main(String[] args) {
        double[] numbers={10.5,5.5,0.05,100.5,586};

        System.out.println(numbers.length);//counts how many elements /numbers we entered in array

        for(int j=0;j<numbers.length;j++){
            System.out.print(numbers[j]+" ");
        }
    }
}
