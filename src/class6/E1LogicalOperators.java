package class6;

public class E1LogicalOperators {
    public static void main(String[] args) {

        boolean chocolates=true;
        boolean flowers=false;
        if(chocolates||flowers)//if either is true it will show the first line
        {
            System.out.println("I am happy");
        }else
        {
            System.out.println("I am sad");
        }

        boolean g5=true;
        boolean wifi=false;
        if(wifi||g5)
        {
            System.out.println("You will be able to use internet");
        }else
        {
            System.out.println("Not connected to the internet");
        }

    }
}
