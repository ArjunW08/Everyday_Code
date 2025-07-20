package Encapsulation;

public class Person {

    private int age;
    private String name;
    static int count = 1;

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
