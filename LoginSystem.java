import java.util.*;

class LoginSystem{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    String correctUsername = "admin";
    String correctPassword = "password";

    int attempts = 3;

    while (attempts > 0){
        System.out.println("Enter username: ");
        String username = sc.nextLine();

        System.out.println("Enter password: ");
        String password = sc.nextLine();

        if (username.equals(correctUsername) && password.equals(correctPassword)){
            System.out.println("Login successful!");
            return;
        } else{
            attempts--;
            System.out.println("Incorrect username or password");
            //System.out.println("Attempts left = " + attempts);

        }
        }
        System.out.println("Account Locked. Too many attempts failed");
        sc.close();
    }

}
