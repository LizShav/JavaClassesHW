package projectsJava;
/*
10. Write a program to print out duplicate elements from
an Array of Strings?
 */
public class Task10ProjectDueApr22 {
    public static void main(String[] args) {
        String [] arr = new String [] {"Food","Fruits","Cars","Food","Fruits"};
        System.out.println("Duplicate elements from an array of String: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]==arr[j]){
                    System.out.println(arr[j]);
                }

            }

        }

    }
}
