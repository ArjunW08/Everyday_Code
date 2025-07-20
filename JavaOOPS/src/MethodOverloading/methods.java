package MethodOverloading;

/*
 * Two or more methods can have same name inside the same class if they accept different arguments.
 * This feature is known as method overloading.
 * 
 * Method overloading is achieved by either:
 *  1. Changing the number of arguments.
 *  2. Or Changing the data type of arguments.
 * 
 * It is not method overloading if we only change the return type of methods.
 * There must be difference in the number of parameters.
 */

public class methods {
    public static void main(String[] args) {
        Greet greet = new Greet();
        greet.greetings();
        greet.greetings("Arjun");
    }
    
}

class Greet {
    void greetings() {
        System.out.println("Hello, Good Morning");
    }

    void greetings(String name){
        System.out.println("Hello " + name + " Good Morning!");
    }
}