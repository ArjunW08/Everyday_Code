package Polymorphism;

/*
 * Stack memory do not require garbage collector.
 * Garbage collector comes periodically to clean memory in heap.
 * 
 * Java Heap Memory : 
 * Java Heap space is used by java run time to allocate memory to Objects and JRE classes.
 * WWhenever we create an object, it's always created in the Heap space.
 * Any object created in the heap space has global acess and can be referenced from 
 * anywhere of the application.
 * 
 * Java Stack Memory : 
 * Java Stack memory contains method specific values that are short lived and references to other 
 * objects in the heap that is getting referred from the method.
 * Whenever a method is invoked, a new block is created in the stack memory for the method to hold
 * local primitive values and the references to other objects in the method. As soon as the method 
 * ends, the block becomes unused and becomes available for the next method. Stack memory size is 
 * very less compared to Heap memory.
 * 
 * Java Object Class : 
 * Object class is present in java.lang package. Every class in Java is directly or indirectly derived 
 * from the object class. If a class does not extend any other class then it is direct child of an Object
 * and if extends another class then it is indirectly derived. Therefore the object class methods are available 
 * to all Java classes. Hence object class acts as a root of the inheritance hierarchy in any Java program.
 * 
 * Object Class methods : 
 * 1. getClass()
 * 2. hashCode()
 * 3. wait()
 * 4. toString()
 * 5. clone()
 * 6. equals()
 * 7. finalize()
 * 8. notify()
 * 9. notifyall()
 * 
 * Contradiction b/w hashCode and Equals :
 * Two object having same value will return same in equals function.
 * Two objects will have same hashcode if they are same. 
 */

class Car {
    String model;
    int year;

    public Car(String model, int year){
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car Model : " + model + " Year : " + year;
    }
}

public class HeapAndStackMemory {

    public static void main(String[] args) {
        Car obj = new Car("BMW", 2030);
        System.out.println(obj); // By default toString() method is called.
    }

}
