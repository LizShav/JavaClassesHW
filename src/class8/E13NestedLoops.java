package class8;

import com.sun.security.jgss.GSSUtil;

public class E13NestedLoops {
    public static void main(String[] args) {
        /*
        12345
        23456
        23456
         */

        for (int j = 0; j<3 ; j++) {//0(j)+1(i)=1 ;
           for(int i=1; i<=5; i++){
               System.out.print(i+j+" ");

           }
            System.out.println();
        }

        }
    }

