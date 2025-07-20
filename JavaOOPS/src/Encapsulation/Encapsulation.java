package Encapsulation;

/*
 * Java packages : 
 * A package is a simple container that groups related types(classes, interfaces, enumerations, and annotations).
 * 
 * To define a package in Java, you use the keyword package.
 * Java used the file system directories to store packages.
 * 
 * Java has an import statement that allows you to import an entire package,
 * or use only certain classes and interfaces defined in the package.
 * In Java, the import statement is written directly after the package statement and 
 * before the class definition
 * 
 * Java Access Modifiers : 
 * In Java, access modifiers are used to set the accessibility(visibility) of classes, interfaces, variables,
 * methods, constructors, data members and the setter methods.
 * 
 *  Access Modifiers        Same Class      Same Package subclass       Same package non-subclass       Different Package subclass      Different package non-subclass
 *  Default                 Yes             Yes                         Yes                             No                              No
 *  Private                 Yes             No                          No                              No                              No
 *  Protected               Yes             Yes                         Yes                             Yes                             No
 *  Public                  Yes             Yes                         Yes                             Yes                             Yes
 * 
 * Java Encapsulation : 
 * Bundling of fields and methods inside a single class.
 * It prevents outer classes from assessing and changing fields
 * and methods of a class. This also helps to achieve data hiding.
 * 
 * Data Hiding is a way of restricting the access of our data members by
 * hiding the implementation details. Encapsulation also provides a way for
 * data hiding. We can use access modifiers to achieve data hiding.
 * 
 * Note : People often consider encapsulation as data hiding, but that's not 
 * entirely true. Encapsulation refers to the bundling of related fields and methods
 * together. This can be used to achieve data hiding. Encapsulation in itself is not
 * data hiding.
 * 
 * Static Keyword : 
 * If we want to access class members without creating an instance of the class,
 * we need to declare the class members static.
 * 
 * Static variables can be accessed by calling the class name of the class.
 * There is no need to create an instance of the class for accessing the static
 * variables because static variables are the class variables and are shared among
 * all the class instances.
 * For static variables/objects memory is allocated at compile time itself.
 * 
 * For Static Variables : 
 * 1. Only a single copy of the static variable is created and shared among all the instances of the class.
 * 2. Because it is a class-level variable, memory allocation of such variables only happens once when the 
 * class is loaded in the memory.
 * 3. Static variables can be used in any type of method: static or non static.
 * 4. Non-static variables cannot be used inside static methods. It will throw a compile time error.
 * 
 * For Static Methods : 
 * 1. The static members and methods belong to the class rather than the instance of the class.
 * When the implementation of the particular method is not dependent on the instance variables
 * and instance methods. In this case, we can make that method to be static.
 * 
 * 2. They are accessed by the name of the class.
 * 3. The keywords such as this and super are not used in the body of the static method.
 * 4. The modification of the static field value is not allowed.
 * 
 * Static block run first even before the main function.
 */

public class Encapsulation {

    static { // Static block.
        System.out.println("Called from the static block");
    }

    public static void PrintHello(){
        System.out.println("Static Method : Hello");
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setAge(24);
        person.setName("Arjun");
        System.out.println("Encapculation");
        System.out.println("Name : " + person.getName());
        System.out.println("Age : " + person.getAge());
        System.out.println("Static count : " + Person.count);
        Encapsulation.PrintHello();
    }
}
