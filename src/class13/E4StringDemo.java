package class13;
/*
Split method with Arrays
 */
public class E4StringDemo {
    public static void main(String[] args) {
        String str="Today is Sunday. We have java class? We like java";
        String [] strArr=str.split("[.?]");//split sentence with ending point which either .?!
        System.out.println(strArr.length);//will say how many sentences divided by a '.'
        System.out.println(strArr[0].trim());//will print 1st sentence
        System.out.println(strArr[2].trim());//will print sentence plus trimmed the space after a dot


    }
}
