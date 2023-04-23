package class13;
/*
Replace Method:str.replace("good","Excellent")
str=str.replace()--reassigning, storing in a variable
 */
public class E1StringDemoReplaceMethod {
    public static void main(String[] args) {
        String str="Batch 16 is good";
        str=str.replace("good","Excellent");//we have stored Excellent in an str variable

        System.out.println(str.replace("good","Excellent"));
        System.out.println(str);
        System.out.println(str.replace('e','E'));//we replaced the lower e to cap E
    }


}
