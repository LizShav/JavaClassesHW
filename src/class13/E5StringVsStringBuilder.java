package class13;
/*
Where do we use String builder?:
When we want to make changes to the strings
it's better to use StringBuilder to avoid the performance hit.

 */
public class E5StringVsStringBuilder {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Java");
        System.out.println(str.reverse());

        String str1="Computer";//to print in reverse we have to convert to StringBuilder
        StringBuilder str2=new StringBuilder(str1);//converted
        str2.reverse();//now we can reverse
        str1=str2.toString();//str1 is a String , then str2.toString() we changed it and then we can use method reverse
        System.out.println(str1);

    }
}
