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

}

class OuterClass {
    void outerMethod() {

    }
}

interface SuperInterface {
    void interfaceMethod();
}
