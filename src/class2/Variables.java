package class2;
/*
2)Create a Java program and name it Variables
In your program create different type of variables to store student’s information(name, last name, grade, city, state, phone number) and then print value of those variables in the format:
My name is  and my  last name is __
I am A/B student
I live in city and state__
And my phone number is …..
 */
public class Variables {
    public static void main(String[] args) {
        String firstName="Liz";
        String lastName="Shav";
        String grade= "A";
        String city="Brooklyn";
        String state="New York";
        String phoneNumber="111-222-3344";
        System.out.println("My name is " +firstName +  " My last name is" + lastName);
        System.out.println("I am"+" "+grade+" "+"student");
        System.out.println("I live in"+" "+city+", "+state);
        System.out.println("My phone number is"+" "+phoneNumber);

        /*
        Part 2 (Changes)

         */
        city= "Austin";
        state="Texas";
        phoneNumber="234-574-8876";
        System.out.println("My name is " +firstName +  " My last name is"+ " " + lastName+ " " + "it has not changed");
        System.out.println("My grade"+" "+grade+" "+"has not changed either");
        System.out.println("I have moved to "+" "+city+", "+state);
        System.out.println("My phone number has changed to "+" "+phoneNumber);


    }
}
