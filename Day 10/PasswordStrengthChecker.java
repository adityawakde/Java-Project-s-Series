import java.util.*;

public class PasswordStrengthChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        checkStrength(password);
    }

    public static void checkStrength(String password) {
        int score = 0;

        // Length check
        if (password.length() >= 8) {
            score++;
        }

        // Uppercase letter check
        if (password.matches(".*[A-Z].*")) {
            score++;
        }

        // Lowercase letter check
        if (password.matches(".*[a-z].*")) {
            score++;
        }

        // Number check
        if (password.matches(".*[0-9].*")) {
            score++;
        }

        // Special character check
        if (password.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            score++;
        }

        // Strength result
        if (score <= 2) {
            System.out.println("Password Strength: WEAK");
        } else if (score <= 4) {
            System.out.println("Password Strength: MEDIUM");
        } else {
            System.out.println("Password Strength: STRONG");
        }
    }
}