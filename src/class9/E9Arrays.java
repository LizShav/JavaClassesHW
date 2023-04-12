package class9;
//print ball the numbers from 6 to 0 in reverse order
public class E9Arrays {
    public static void main(String[] args) {
        int [] counter={0,1,2,3,4,5,6};
        for (int i = 6; i >=0 ; i--) {
            System.out.print(counter[i]+" ");
        }System.out.println();

        char [] chars={'A','B','C','D','E','F'};
        for (char a = 5; a >=0 ; a--) {
            System.out.print(chars[a]+" ");
        }

    }
}
