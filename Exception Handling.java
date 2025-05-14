// Exception Handling in Java
// Java provides a robust mechanism for handling exceptions using try-catch blocks.
// The try block contains code that may throw an exception.
// If an exception occurs, the Java Virtual Machine (JVM) transfers control to the appropriate catch block,
// where the exception can be handled by the programmer.
// This program demonstrates the use of try-catch blocks to handle exceptions,
// and the finally block to execute code regardless of whether an exception occurred.

// Exception types in Java are categorized into two main categories:
// 1. Checked Exceptions: These are exceptions that are checked at compile-time.
//    Examples include IOException, SQLException, etc.
// 2. Unchecked Exceptions: These are exceptions that are not checked at compile-time.
//    Examples include NullPointerException, ArrayIndexOutOfBoundsException, etc.

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        int quotient, dividend = 10, divisor = 0; 
        try {
            If (divisor == 0) {
                throw new ArithmeticException("Divisor cannot be zero");
            quotient = dividend / divisor;
            }
        catch (ArithmeticException e) {
                    System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of an exception.");
        }
    }
}

// Implicit exceptions: They are defined by subtypes Error and RuntimeException.
// They can occur at runtime and are not checked at compile-time.

// Explicit exceptions: All exceptions that are not implicit are considered explicit. 
// They are defined by subtypes Exception and Throwable.
// This type of exception is checked at compile-time and unavoidable.
// The programmer must handle them using try-catch blocks. 
