package class14;
//prime number
public class hwtask3 {
    boolean isPrime(int num){

            boolean isPrimeNum=true;
            int count=0;

            for(int i=2;i<=num;i++){
                if(num%i==0){
                    count++;
                    break;
                }

                if(count>1){
                    isPrimeNum=false;}
            }

            return isPrimeNum;
    }

        public static void main(String[] args) {
            int num=4;
            hwtask3 obj=new hwtask3();
            boolean result= obj.isPrime(num);
            System.out.println(result);
        }


    }

