import java.util.Scanner; // Import Scanner to read input from the user

public class PasswordCheck {
    public static void main(String[] args) {
        System.out.println("Type your password"); // Prompt the user to enter a password

        Scanner scanner = new Scanner(System.in); // Create a Scanner object to read input
        String password = scanner.nextLine(); // Read the password entered by the user

        try {
            checkPassword(password); // Call the method to validate the password
            System.out.println("Password is valid."); // If no exception is thrown, it's valid
        } catch (PasswordException e) {
            // If an exception is caught, display the error message
            System.out.println("Password is invalid: " + e.getMessage());
        }
    }

    // Method to check if the password meets the security criteria
    public static void checkPassword(String password) throws PasswordException {
        // Check if the password is at least 6 characters long
        if (password.length() < 6) {
            throw new PasswordException("Password must be at least 6 characters long.");
        }

        // Check if the password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) {
            throw new PasswordException("Password must contain at least one uppercase letter.");
        }

        // Check if the password contains at least one digit
        if (!password.matches(".*[0-9].*")) {
            throw new PasswordException("Password must contain at least one digit.");
        }
    }
}

// Custom exception class for handling password validation errors
class PasswordException extends Exception {
    // Constructor that accepts a custom error message
    public PasswordException(String message) {
        super(message); // Call the parent Exception constructor with the message
    }
}

// Explaination line by line:
// 1. The code defines a class named `PasswordCheck`.
// 2. The `main` method is the entry point of the program.
// 3. It prompts the user to type their password.
// 4. A `Scanner` object is created to read user input.
// 5. The user input is read and stored in the `password` variable. 