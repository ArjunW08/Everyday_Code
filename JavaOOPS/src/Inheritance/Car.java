package Inheritance;

public class Car extends Vehicle{

    final int gears = 4;

    Car(){
        super("Audi", 4);
    }

    public static void main(String[] args) {
        Car obj = new Car();
        Car obj2 = new Car(); 
        obj.wheelCount = 4;
        obj.Model = "BMW";
        obj.start();
        obj2.start();
    }

    void start(){ // Method Overriding
        super.start();
        System.out.println(this);
        System.out.println(this.Model + " : Car is starting.");
    }
}
