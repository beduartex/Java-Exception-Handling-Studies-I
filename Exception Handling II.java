// How to create new exceptions in Java
// // To create a new exception in Java, you can define a custom exception class that 
// extends the Exception class.
// // This allows you to create your own exception types that can be thrown and caught in your code.
// // Here's an example of how to create a custom exception in Java:
//
// // Custom exception class
class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
// super is a keyword in Java that refers to the superclass of the current object.
// It is used to access members (methods and variables) of the superclass from the subclass.
// In this case, super(message) calls the constructor of the Exception class with the provided message.
// This allows the custom exception to inherit the behavior of the Exception class while adding its own message.
//
// Every object instantiated from a class derived from Throwable contains a snapshot of the execution stack at
// the time it was created. This snapshot is called the stack trace.
// If the constructor is empty, this means that the exception cannot receive a Throwable object;
// In other words, it is not able to carry the execution context of previous exceptions that may have caused it.
// Nevertheless, it still has its own execution context and can pass it forward.