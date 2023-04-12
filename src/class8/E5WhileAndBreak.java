package class8;

public class E5WhileAndBreak {
    public static void main(String[] args) {

        //create a boolean variable Summer , store True in it , then write a loop that runs as long as it is summer
        // create a temp variable store 85 and inside the loop check for temp, if it less than a 100 print "its good I enjoy summer"
        //as soon as temp exceeds 100 , print"its very hot" and break the loop with break keyword

        boolean summer=true;
        int temp=96;
        while(summer){
            if(temp<=100){
                System.out.println("It's good I enjoy the summer");
                break;
            } else {
                System.out.println("Its very hottt");
                break;
            }


        }temp=temp+3;

    }
}
