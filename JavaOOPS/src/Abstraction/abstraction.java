package Abstraction;

/*
 * Java Abstraction : 
 * THe abstract class in Java cannot be instantiated i.e we cannot create objects of abstract classes.
 * We use the abstract keyword to declare an abstract class.
 * 1. An abstract class can have both the regular methods and abstract methods.
 * 2. A method that doesn't have it's body is known as an abstract method.
 * 3. Though abstract classes cannot be instantiated, we can create subclasses from it.
 * We can then access members of the abstract class using the object of the subclass.
 * 4. If the abstract class includes any abstract method, then all the child classes inherited from the abstract super classes
 * must provide the implementation to the abstact method.
 * 5. If any one method present in a class is abstract then the whole class needs to declared as abstract.
 * 
 * Abstraction is an important concept of object-oriented programming that allows us to hide 
 * unnecessary details and only show the needed information.
 * This allows us to manage complexity by omitting or hiding details with a simpler,
 * higher-level idea.
 */

public class abstraction {

}

abstract class Vehicle {
    abstract void accelerate();

    abstract void brakes();
}

class Car extends Vehicle{

    @Override
    void accelerate() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'accelerate'");
    }

    @Override
    void brakes() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'brakes'");
    }
    
}
