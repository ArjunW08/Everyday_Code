package ClassesAndObjects;

public class classesAndObjects {
    /*
     * Class ia blueprint which defines some properties and behaviours. An object is an instance of a class which has those properties
     * and behaviours attached.
     * A class is not a allocated memory when it is defined. An object is a allocated meory when it is created.
     * Class is a logical entity and object is a physical entity. A class is declared only once. On the other hand we can create multiple
     * objects of a class.
     * 
     * Memory named as metaspace is used to store the details of the class in memory.
     * 
     * A class is way to arrange data and behaviour information. It is a template that must be implemented by its objects.
     * A class can also be seen as a under-efined data type where any object of defined data type has some predefined 
     * properties and behaviors.
     * 
     * 
     */

     public static void main(String[] args) {
        Dog d1 = new Dog();
        d1.bark();
        d1.walk();
     }
}

class Dog {
    String name;
    int age;
    String color;

    void walk(){
        System.out.println("Walking");
    }

    void bark(){
        System.out.println("Barking");
    }
}


