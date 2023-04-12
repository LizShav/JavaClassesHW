package class3;
//HW 3/25/23 #2
/*
Create a Java program and name it Temperature Check. Create variable to store temperature.
Your program should check if temperature is below 32 then it should print
“Water will freeze with temperature ”, otherwise “Water will NOT freeze with temperature ”.
 */
public class TemperatureCheck {
    public static void main(String[] args) {

        int temp=32;

        if(temp<=32)
        {
            System.out.println("Water will freeze with temperature");
        }
        else
        {
            System.out.println("water will not freeze with temperature");
        }
    }
}
