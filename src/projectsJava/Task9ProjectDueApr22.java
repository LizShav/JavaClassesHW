package projectsJava;
/*
9. Write a java program to find the second largest
number in the array?

 */
public class Task9ProjectDueApr22 {
    public static void main(String[] args) {
        int num, size;
        int array[] = {10, 20, 25, 63, 96, 57};
        size = array.length;

        for(int i = 0; i<size; i++ ){
            for(int j = i+1; j<size; j++){

                if(array[i]>array[j]){
                    num = array[i];
                    array[i] = array[j];
                    array[j] = num;
                }
            }
        }
        System.out.println("Second largest number is:: "+array[size-2]);

    }
}
