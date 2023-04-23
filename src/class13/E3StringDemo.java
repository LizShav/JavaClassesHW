package class13;
/*
[^a-z]-^ means not operators ,^ do not replace lowercase
$ has a special meaning in regex(reg expression) so it wont be able to replace it with. but with an exception
we can replace with a $ if we add \\$
 */
public class E3StringDemo {
    public static void main(String[] args) {
        String str="ksnfksnDSKHJH123456    !@#$@#&^$%((&&";
        //^ don't replace lowercase letters from a to z
        System.out.println(str.replaceAll("[^a-z]",""));//replace with "" will delete the letter
        //^ don't replace lowercase letters from a to z and 0-9
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));
        System.out.println(str.replaceAll("[Dn3]",""));//will remove selected characters
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll(" ","\\$"));//spaces replaced with $ sign

    }

}
