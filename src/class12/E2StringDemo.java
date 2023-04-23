package class12;
//with logical operator and &&
public class E2StringDemo {
    public static void main(String[] args) {
        String userName="admin";
        String password="pass123";
        //Requirements:read below to write a code
        //write code to check the username and password and if the username and password
        //are less than 8 characters this msg should print:"Signup Successfully"
        //otherwise print "Username and password cant be more than 8 characters"

        if(userName.length()<8 && password.length()<8){
            System.out.println("Signup Successfully");
        }else{
            System.out.println("Username and password cant be more than 8 characters");
        }
    }
}
