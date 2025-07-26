package Wrappers;

/*
 * Wrapper Classes :
 * A wrapper class in Java is a whose object wraps or contains
 * primitive data types. When we create an object to a wrapper class, 
 * it contains a field and in this field, we can store a primitive datatypes.
 * 
 * Need of Wrapper Classes
 * 1. A classes in java.util package handles only objects and hence wrapper
 * classes help in this case also.
 * 2. Data structures in the collection framework, such as ArrayList and Vector, 
 * store only objects(reference types) and not primitive types.
 * 3. An object is needed to support synchronization in multithreading.
 * 
 * Autoboxing & Unboxing
 * The automatic conversion of primitive types to the object of their corresponding
 * wrapper classes is known as autoboxing. For ex.: conversion of int to Integer,
 * long to Long, double to Double, etc.
 * 
 * It is just the reverse process of autoboxing. Automatically converting an object of a arapper
 * class to its corresponding primitive type is known as unboxing. For example - conversion of 
 * Integer to int, Long to long, Double to double, etc.
 * 
 *  
 */

public class Wrappers {
    public static void main(String[] args) {
        // Integer obj = new Integer(12); This is Deprecated after Java-9
        Integer obj2 = Integer.valueOf("12");
        Integer obj3 = 12; // Autoboxing
        int age = obj2; // Unboxing

    }

}
