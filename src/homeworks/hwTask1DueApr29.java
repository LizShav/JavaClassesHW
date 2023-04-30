package homeworks;
/*
Task1 Write a code that will take in a String input and check to see if it is a palindrome or not

a palindrome means that the characters are the same forwards and backwards, ignoring spaces
example level madam kayak ex: car>rac Madam>madaM
 */
public class hwTask1DueApr29 {
    boolean isPalindrome(String str){
        String reversedStr="";
        for (int i = str.length()-1; i >=0; i--) {//reverse loop
            reversedStr=reversedStr+str.charAt(i);
        }
        boolean isStrPalindrome=false;
        if(str.equalsIgnoreCase(reversedStr)){
            isStrPalindrome=true;

        }
        return isStrPalindrome;

    }

    public static void main(String[] args) {
        hwTask1DueApr29 task1=new hwTask1DueApr29();
        boolean result=task1.isPalindrome("Madam");
        System.out.println(result);
    }

}
