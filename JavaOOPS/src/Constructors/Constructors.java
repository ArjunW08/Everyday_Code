package Constructors;

/*
 * Construtors are invoked when you instantiate objects.
 * Two rules for creating a construtors are : 
 *  1. The name of the construtor should be the same as the class.
 *  2. A java constructor must not have a return type.
 * 
 * If a class doesn't have a constructor, the Java compiler automatically creates a default constructor
 * during run time. The default construtor initializes instance variables with default values.
 * 
 * Default Constructor : A constructor that is automatically created by the java compiler if it is not 
 * explicitly defined. 
 * A constructor cannot be abstract or static or final.
 * A constructor can be overloaded but can not be overridden.
 * 
 * If you have defined a constructor by yourself then you cannot call the default constructor.
 * 
 * This Keyword 
 * In Java, this keyword is used to refer to the current object inside a method or a construtor.
 * We mostly use this keyword to remove any Ambiguity in Variable names. We can also use this to invoke
 * methods of the current class or to invoke a constructor of the current class.
 */

public class Constructors {
    public static void main(String[] args) {
        Complex complex = new Complex();
        complex.print();

        Complex complex2 = new Complex(2,3);
        complex2.print();
        
    }

}

class Complex{

    int a, b;

    public Complex(){
        a = 0;
        b = 0;
    }

    public Complex(int real, int imaginary){
        this.a = real;
        this.b = imaginary;
    }

    void print(){
        System.out.println("You have called a print function of Complex class.\n a = " + a + " b = " + b);
    }


}
