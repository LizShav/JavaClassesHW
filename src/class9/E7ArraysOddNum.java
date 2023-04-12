package class9;

public class E7ArraysOddNum {
    public static void main(String[] args) {
        /*
        create array store 10,50,60,45,100 , then print elements which are present on odd index.
         */
        int [] oddNumbers={10,50,60,45,100};//odd indexes are 1=50 and 3=45, thats our output

        for(int i=0; i<oddNumbers.length; i++){
            if(i%2!=0)//will print odd numbers
                System.out.print(oddNumbers[i]+" ");

        }
    }
}
