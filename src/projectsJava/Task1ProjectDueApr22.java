package projectsJava;
/*
1)Create a program that uses an array to store a list of
temperatures for a week, and then uses a loop to find
the highest and lowest temperature for the week.
 */
public class Task1ProjectDueApr22 {
    public static void main(String[] args) {
        int[] temp={10,15,25,30,70,80,85};
        int min;
        int max;
        max=temp[0];
        min=temp[0];
        for (int i = 0; i <temp.length ; i++) {
            if(temp[i]<min) min=temp[i];
            if(temp[i]>min) max=temp[i];


        }
        System.out.println("the lowest temp is "+min+" "+"the highest temp is "+max);







        }



        }



