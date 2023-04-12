package class7;
//do while : syntax do{sout;++}while ;
public class E17DWhileLoop {
    public static void main(String[] args) {
        int i=0;
        while(i>10){
            System.out.println(i);
        }

        do{
            System.out.println(i);
            i++;
        }while(i>10);
    }
}
