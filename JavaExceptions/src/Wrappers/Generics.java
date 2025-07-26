package Wrappers;

/*
 * Generics means parameterized types. Using Generics. it is possible to create classes
 * that work with different data types. An entity such as class, Interface, or method that
 * operates on a parameterized type is a generic entity.
 * 
 * Java Generics Method
 * Similar to the generics class, we can also create a method that can be used with any type
 * of data. Such a class is known as Generics Method.
 * 
 * We can call generics method by placing the actual type inside the bracket before the method
 * name. Here type parameter <T> is inserted after the modifier and before the return type.
 * 
 * Bounded Generics : 
 * In general, the type parameter can accept any data types(except primitve types). However, if
 * we want to use generics for some specific types(such as accept data of number types) only, then
 * we can use bounded type. This means GenericsClass can only work with data types that are children
 * of Number (Integer, Double, and so on).
 * 
 */

public class Generics {
    public static void main(String[] args) {
        Dog<Integer,String> Pet1 = new Dog<>(1, "Bruno");
        System.out.println(Pet1.getData());
        Dog<Integer, String> Pet2 = new Dog<>(2, "Mars");
        System.out.println(Pet2.getData());
    }

    public <T> void genericMethod(T Data){
        System.out.println("This generic method returns : " + Data);
    }

}

// Generic Class
class Dog<T, V> {
    T id;
    V name;

    public Dog(T id, V name){
        this.id = id;
        this.name = name;
    }

    public T getData() {
        return this.id;
    }

    public <T extends Number> void doubleData(T data){
        System.out.println(data);
    }
}

// class Dog<T, V extends Number> { //Bounded Generics
//     T id;
//     V name;

//     public Dog(T id, V name) {
//         this.id = id;
//         this.name = name;
//     }

//     public T getData() {
//         return this.id;
//     }
// }