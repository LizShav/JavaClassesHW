package class6;

public class E3LogicalOperators {
    public static void main(String[] args) {
        //task : who can buy rolce royce (only those with moeny and invitation)
        boolean money=true;
        boolean invitationFromRR=false;// false is like you dont have the invitation and the result will be else part
        //because && operator it has to be true for all (if) conditions

        if(money&&invitationFromRR){
            System.out.println("yes you can buy RR");
        }
        else{
            System.out.println("You cant buy RR");
        }


    }
}
