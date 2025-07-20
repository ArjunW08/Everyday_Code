import java.util.Scanner;

/*
 * If Statement
 * If-Else Statement
 * If-Else-If Statements
 * Nested If-Else Statements
 * Ternary Operator
 // (a > b) ? (a > c) ? System.out.println("A is largest") : System.out.println("C is Largest") : (b > c) ? System.out.println("B is Largest") : System.out.println("C is Largest"); 
 // You Can't put print methods with ternary operators as it return's void.
 * Switch Statements : If any case matches it will print all the cases below it if we do not put break statements.
 */

public class ConditionalStatements {

    public static void main(Strings[] args) {
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


        int max = (a > b) ? (a > c) ? a : c : (b > c) ? b : c;
        System.out.println("Largest element : " + max);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        sc.close();

        switch (day){
            case 1:
                System.out.println("Today is Sunday");
                break;
            case 2:
                System.out.println("Today is Monday");
                break;
            case 3:
                System.out.println("Today is Tuesday");
                break;
            case 4:
                System.out.println("Today is Wednesday");
                break;
            default:
                System.out.println("I consider it's Friday, weekend about to start.");
        }


    }
}
