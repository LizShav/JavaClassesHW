package class18;
/*
the offset parameter specifies the starting position of the substring in the chars2 array,
 and it is zero-based. So, offset = 3 means that the substring starts at the fourth element in the chars2 array,
  which is 'J'. The length parameter specifies the number of characters to include in the substring,
  which is 4 in this case. Therefore, the resulting str2 String object will contain the substring "Java".
 */

public class E1MultipleConstructor {
    public static void main(String[] args) {
        String str=new String("Java");
        char [] chars={'J','a','v','a'};
        //convert ^^ to uppercase by using below code
        String str1=new String(chars);

        //below extract java and convert it to upper case
        char [] chars2={'t','h','e','J','a','v','a'};
        String str3=new String(chars2,3,4);//offset 3 means , we don't want/ignore the first 3 letters: t h e, and count 4 letters after
        System.out.println(str3.toUpperCase());


    }
    static void method2(String name, int age){

    }
}
