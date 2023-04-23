package class13;
/*
Create a String and if the String is not empty perform the following:
if the String has an odd number of characters and has 3 or more characters, print the character in the middle of the String.
For Example String str=hello =>l
 */
public class Task1 {
    public static void main(String[] args) {
       // String str=new String("Java"); longer way, below is a shorter way and widely used
        String str="Hello";//the word has to contain odd numbers of characters
        if(!str.isBlank()&& str.length()%2!=0 && str.length()>=3){
            int middleIndex=str.length()/2;//to get the middle character
            char middleChar=str.charAt(middleIndex);
            System.out.println(middleChar);

        }

    }

}
