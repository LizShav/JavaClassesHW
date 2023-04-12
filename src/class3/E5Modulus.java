package class3;
//Modulus/Remainder(%)-to find out how much has left after division.
public class E5Modulus {
    public static void main(String[] args) {

        int number1=10;
        int number2=4;
        System.out.println(number1/number2);
        System.out.println(number1%number2);

        int number3=11;
        int number4=4;
        System.out.println(number3/number4);
        System.out.println(number3%number4);

        int noOfSlices=3;
        int noOfIndividuals=2;
        System.out.println(noOfSlices/noOfIndividuals);// '/' how many pieces will each individual will get
        System.out.println(noOfSlices%noOfIndividuals);// '%' how many pieces will be left behind

    }
}
