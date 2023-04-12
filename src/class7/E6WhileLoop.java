package class7;

public class E6WhileLoop {
    public static void main(String[] args) {
//print numbers 2 4 6 8 10 12 14 (we need to jump over 1 number so we +=2)
        int num=2;
        while(num<=14){
            System.out.println(num);
            num++;
            num++; //or can be shortened to num+=2 or num=num+2
        }
    }
}
