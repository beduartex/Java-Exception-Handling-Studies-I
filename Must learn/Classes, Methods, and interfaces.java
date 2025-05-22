// Classes, Methods, and Interfaces in Java

// What is a class?
// - A class is a blueprint for creating objects. It defines the properties (fields) and behaviors (methods) of those objects.
// - Objects are instances of a class.

// What can a class contain?
// 1. Fields (also called attributes or variables)
//    - Store the state/data of an object.
// 2. Methods
//    - Define the behavior or actions of an object.
// 3. Constructors
//    - Special methods used to initialize new objects.
// 4. Static fields and methods
//    - Belong to the class itself, not to any particular instance.
// 5. Inner and nested classes
//    - Inner class: a class defined within another class.
//    - Static nested class: a static class defined inside another class.
// 6. Enums
//    - Special classes that represent a group of constants.
// 7. Interfaces
//    - Define a contract (a set of abstract methods) that classes can implement.
// 8. Annotations
//    - Metadata that provides additional information to the compiler or runtime.
// 9. Static blocks
//    - Code blocks that run once when the class is loaded.
// 10. Instance initializer blocks
//     - Code blocks that run every time an object is created.

// Notes:
// - Java does not have destructors like C++. Instead, Java uses a garbage collector.
// - The `finalize()` method was used for cleanup, but it's deprecated and should not be relied upon.
// - For resource cleanup, use try-with-resources or explicitly close resources (like files or sockets).

// Example of a class with fields, methods, and a constructor
class Person {
    // Fields
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display person's information
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}