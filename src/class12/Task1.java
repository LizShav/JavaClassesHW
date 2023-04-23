package class12;
/*
Store username, password and confirm password from a user and check following requirements:

Username and Password cannot be  empty, if so→ message=”Username or Password cannot be empty”.
Password should be minimum 8 characters, if less → message=”Password is too short”.
Password cannot contain username if so, → message=”Password cannot contain username”.
Password should match confirmed password, if not  → message=“Passwords do not match”.

Only after all requirements met → message “Your username and password has been created”
You do not have permission to send messages in this channel.
 */
public class Task1 {
    public static void main(String[] args) {
        String username="administrator";
        String password="pass123@";
        String confirmyourpassword="pass123@";

        if(username.isEmpty() && password.isEmpty()){
            System.out.println("Username or password cannot be empty");
        }
        else if(password.length()<8){
            System.out.println("Password is too short");
        }
        else if(password.equals(username)){
            System.out.println("Password cannot contain username");

        }
        else if(!password.equals(confirmyourpassword)){
            System.out.println("Password do not match");
        }
        else{
            System.out.println("Your username and password has been created. Great job you have successfully signed up");
        }



    }
}
