package Inheritance;

public class Vehicle {
    String Model;
    int wheelCount;

    Vehicle(){
        this.Model = "";
        this.wheelCount = 0;
    }

    Vehicle(String name, int wheelsCount){
        this.Model = name;
        this.wheelCount = wheelsCount;
    }

    void start(){
        System.out.println("Ignition Onn.");
    }

    final void accelerate(){
        System.out.println("Vehicle is accelerating.");
    }
}
