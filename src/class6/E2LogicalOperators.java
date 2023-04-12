package class6;
//logical && (and) operator = both conditions need to be true , if one false then executes false
public class E2LogicalOperators {
    public static void main(String[] args) {
        double marksInMath=80;
        double marksInScience=95;

        if(marksInMath>90 && marksInScience>90)
        {
            System.out.println("you are a brilliant student");
        }else
        {
            System.out.println("You need to work hard");
        }


    }
}
