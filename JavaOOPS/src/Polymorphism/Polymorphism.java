package Polymorphism;

/*
 * Polymorphism allows us to perform a single action in differnt ways. In other words, polymorphism allows you to define one 
 * interface and have multiple implementations. The word poly means many and morphis means forms. So it means many forms.
 * There are two types of Polymorphisms : 
 * 1. Compile-time Polymorphism(Overloading)
 * 2. Runtime Polymorphism(Overriding)
 */

public class Polymorphism {
    public static void main(String[] args) {
        Data data = new Data();
        Data data2 = new Info(); // It is allowed and it runs the methods of parent class written on the left side.
        Info info = new Info();
        data.text = "Hello";
        data.printData();
        data2.text = "Hello2"; 
        info.data = "Hello3";
        data2.printData(4);
        info.printData();
    }
}

class Data {
    String text;

    void printData(){
        System.out.println(this.text);
    }

    void printData(int i){ // Compile-time Polymorphism.
        System.out.println(this.text);
    }
}

class Info extends Data{
    String data;

    @Override // Runtime Polymorphism.
    void printData(){
        System.out.println("Override parent class method here.");
    }
}