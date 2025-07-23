package Interfaces;

/*
 * Anonymous Classes : 
 * In java, a class can contain another class known as nested class.
 * It is possible to create a nested class without giving any name.
 * A nested class that doesn't have any name is known as anonymous class.
 * 
 * Anonymous classes usually extend subclasses or implement interfaces.
 * Here, the type can be 
 * 1. A superclass that an anonymous class extends.
 * 2. An interface that an anonymous class implements.
 * 
 * Functional Interfaces :
 * An interface that contains exactly one abstract method is known as a functional interface.
 * Functional 8 was introduced in Java 8 allows us to use lambda expression to initiate the interface's
 * method and avoid using length codes for the anonymous class implementation.
 * 
 * Lambda Expression : 
 * (int x) -> x + 1 Single declared-type argument.
 * (int x) -> { return x+1;} Same as above
 * (x) -> x + 1 Single inferred-type argument
 * x -> x + 1 Parenthesis optional for single inferred-type case.
 * 
 * (String s) -> s.length() Single declared type argument.
 * (Thread t) -> {t.start();} Single declared type argument.
 * s -> s.length() Single inferred type argument.
 * t -> { t.start(); } Single inferred type argument.
 * 
 * (int x, int y) -> x + y Multiple declared type parameters.
 * (x,y) -> x+y Multiple inferred type parameters.
 */

public class Classes {

    class Innerclass {
        int price;
    }

    static class NestedClass {
        int price;
    }

    public static void main(String[] args) {
        Classes obj = new Classes();
        Innerclass inner_obj = obj.new Innerclass();
        inner_obj.price = 1;

        NestedClass nested_obj = new Classes.NestedClass();

        Walkable walkable = (int steps) -> {
            System.out.println("Walked " + steps + " steps.");
        };

        walkable.walks(10);

        
    };

    OuterClass outer = new OuterClass() {

        void sing(){

        }

        public void outerMethod(){

        }
    };

    SuperInterface obj2 = new SuperInterface() {
        @Override
        public void interfaceMethod(){
            
        }
    };

    // Lambda Expression for funtional interface
    SuperInterface obj3 = () -> {

    };

}

class OuterClass {
    void outerMethod() {

    }
}

@FunctionalInterface
interface SuperInterface {
    void interfaceMethod();
}

interface Walkable {
    void walks(int steps);
}
