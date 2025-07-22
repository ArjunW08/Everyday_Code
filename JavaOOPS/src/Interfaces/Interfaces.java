package Interfaces;

/*
 * Java Intefaces : 
 * An interface is a fully abstract class. It includes a group of abstract methods.
 * We use the interface keyword to create an interface in Java.
 * 
 * Like abstract classes, we cannot create objects of interfaces.
 * To use an interface, other classes must implement it. We use implements keyword to 
 * implement an interface. 
 * 
 * We can implement multiple interfaces in a single class.
 * 
 * Adv : 
 * 1. Similar to abstract classes, interfaces help us to achieve abstraction in Java.
 * 2. Interfaces are also used to achieve multiple inheritance in Java.
 * Note : All the methods inside an interface are implicitly public and all fields
 * are implicitly public static final.
 * 3. You can also implement default methods in interfaces.
 * 
 * Inner Classes : A non-static nested class is a class within another class. It has access to 
 * members of the enclosing class(outer class). It commonly known as inner class.
 * Since the inner class existis within the outer class, you must instantiate the 
 * outer class first, in order to instantiate the inner class.
 * 
 * Nested Static Class : Unlike inner class, a static nested class cannot access the 
 * member variables of the outer class. It is because the static nested class doesn't
 * require you to create an instance of the outer class.
 * 
 * Using the nested class makes your code more readable and provide better encapsulation.
 */

public class Interfaces {

}

interface Pet {
    void sings();
    void drinks();

    default void walk(){
        System.out.println("Pet is walking.");
    }
}

interface Animal {
    void eats();
    void drinks();
}

class Monkey implements Pet, Animal{

    @Override
    public void eats() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'eats'");
    }

    @Override
    public void sings() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'sings'");
    }

    @Override
    public void drinks() {
        System.out.println("Monkey is Drinking");
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'drinks'");
    }
}
