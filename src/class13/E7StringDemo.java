package class13;

public class E7StringDemo {
    public static void main(String[] args) {
        String name="Marina";//immutable not good to make changes. one box will be shared by everyone
        String name1="Abdul";//immutable it will search existing cells in memory,
        String name2="Brett";//immutable
        String country="USA";//immutable
        String country2="USA";//immutable
        String country3="USA";//immutable
        StringBuilder country4=new StringBuilder("USA");//mutable, it will just go and wont check for other cells in memory
        StringBuilder country5=new StringBuilder("USA");//mutable, but we might be wasting more memory space
        StringBuilder country6=new StringBuilder("USA");//mutable


    }
}
