package class11;

public class E72DArrays {
    public static void main(String[] args) {
        boolean [][] arr2D= {{true,false,true,true,false},
                            {true,false,false,false,false}
        };
        int count=0;
        for (boolean[] arr1D : arr2D) {
            for (boolean aBoolean : arr1D) {
                if(aBoolean==true){
                    count++;}
            }


        }System.out.println("The total count of true"+ " "+count);
    }
}
