package class9;
//Examples :add names.length: will give you all the elements we entered in arrays
//example 2: names.length-2: will give names out of the ones you entered but not those that we try to -2
public class E5ArraysString {
    public static void main(String[] args) {
//Task: create array of Strings store 5 names, print all of them eith help of for loop
        //plus use while loop to print all of them
        String [] names={"Jack","Millie","Rose","Jim","Smith"};

        for(int i=0;i<names.length;i++){
            System.out.print(names[i]+" ");
        }
        //adding while loop below
        System.out.println();//to get it print on the second line after For loop
        int counter=0;
        while(counter<names.length){
            System.out.print(names[counter]+" ");
            counter++;//added it to not have infinite loop , so it will stop
        }
    }
}
