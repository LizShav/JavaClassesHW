package class18;

public class Furniture {
    String color="Black";

}
class Chair extends Furniture{
    String color="White";//instance variable color here 2nd priority

    void printColor(){
        String color="Blue";//local variable 1st priority
        System.out.println(color);//will print out blue
        System.out.println(this.color);//when we use this keyword , instance variable called color -white under Chair class
        //below super keyword to get from parent class 3rd priority
       System.out.println(super.color);// basicly asking java to print the color of super class by using super keyword from parent class
    }
}
class FurnitureTester{
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}