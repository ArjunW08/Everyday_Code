package Everyday_Code.JavaBasics;

/*
 * If Statement
 * If-Else Statement
 * If-Else-If Statements
 * Nested If-Else Statements
 * Ternary Operator
 * Switch Statements
 */

public class ConditionalStatements {

    public static void main(String[] args) {
        int age = 20;
        if(age >= 18){
            System.out.println("You are elder");
        }else{
            System.out.println("You are younger");
        }

        // Find largest number among 3 numbers

        int a = 4;
        int b = 8;
        int c = 1;

        if (a > b){
            if (a > c){
                System.out.println("a is largest");
            }else {
                System.out.println("c is largest");
            }
        }else if(b > c){
            System.out.println("b is largest");
        }else {
            System.out.println("c is largest");
        }

        // (a > b) ? (a > c) ? System.out.println("A is largest") : System.out.println("C is Largest") : (b > c) ? System.out.println("B is Largest") : System.out.println("C is Largest"); 

    }
}
