package class13;
/*
You have a String a=”Is it saturday? Is it raining?
 Do we have a Java Class today?” How would you find out how many sentences are in that String?
 */
public class Task4SplitMethod {
    public static void main(String[] args) {
        String a="Is it saturday? Is it raining?Do we have a Java Class today?";
        String [] a2=a.split("[?]");
        System.out.println(a2.length);
    }
}
