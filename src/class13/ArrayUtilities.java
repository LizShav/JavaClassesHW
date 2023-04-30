package class13;

public class ArrayUtilities {
    public static void main(String[] args) {
        //write the logic to search if the num 100 is present in the array
        int [] arr={10,20,45,89};
        int [] arr1= {12,32,455,889};
        int [] arr2={120,302,5,889};
        int num=89;
        int num1=10;
        int num2=10;

        ArrayUtilities lol= new ArrayUtilities();
        lol.searchArray(arr,num);//will print yes
        lol.searchArray(arr1,num1);//will not print because 10 doesn't exist in an array
        lol.searchArray(arr2,num2);//will not print because 10 doesn't exist in an array

    }
    void searchArray(int [] arr,int num){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==num){
                System.out.println("Yes");
                break;
            }


        }
    }
}
