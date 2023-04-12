package class5;
//create a variable, store the value 20000 inside that variable
//write if else if money is >10000//then another variable to check for what day it is
//it should say lets go shopping
public class E4NestedIf {
    public static void main(String[] args) {
        int money=5000;
        String day="Monday";
        if(money>10000)
        {
            if(day.equals("Sunday"))
            {
                System.out.println("Lets go shopping");
            }
            else
            {
                System.out.println("Lets wait for Sunday");
            }
        } else{
            System.out.println("Lets save some more");
        }



    }
}
