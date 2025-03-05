


import java.util.Scanner;

public class mail {
    public static void main(String[] args) {
        Scanner rr = new Scanner(System.in);

        // Define the array of emails and passwords
        String[] emails = {"kavi33@gmail.com", "id33@gmail.com", "war6@gmail.com"};
        String[] passwords = {"12345678", "abcdefgh", "abcd1233"};

        // Prompt for email input
        System.out.print("Enter Gmail: ");
        String gmail = rr.nextLine();

        // Prompt for password input
        System.out.print("Enter password: ");
        String enterPassword = rr.nextLine();

        // Check if the entered email and password are valid
        boolean emailExists = true;
        for (int i = 0; i < emails.length; i++) {
            if (emails[i].equals(gmail) && passwords[i].equals(enterPassword)) {
                emailExists = false;
                break;
            }
        }

        // Login validation
        if (emailExists) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Invalid email or password.");
        }

        // Check password strength
        checkPasswordStrength(enterPassword);

        rr.close(); // Close the scanner
    }

    // Method to check password strength
    public static void checkPasswordStrength(String password) {
        int strengthScore = 0;

        // Check password length
        if (password.length() >= 8) {
            strengthScore++;
        }

        // Check if password contains at least one digit
        if (password.matches(".*[0-9]+.*")) {
            strengthScore++;
        }

        // Check if password contains at least one uppercase letter
        if (password.matches(".*[A-Z]+.*")) {
            strengthScore++;
        }

        // Check if password contains at least one lowercase letter
        if (password.matches(".*[a-z]+.*")) {
            strengthScore++;
        }

        // Password strength feedback
        if (strengthScore <= 1) {
            System.out.println("Password strength: Weak. Try better.");
        } else if (strengthScore == 2 || strengthScore == 3) {
            System.out.println("Password strength: Moderate. Try better.");
        } else {
            System.out.println("Password strength: Strong.");
        }
    }
}
