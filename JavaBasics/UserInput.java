package Everyday_Code.JavaBasics;

import java.util.Scanner;

// Various methods : nextLong(), nextFloat(), nextDouble(), next()

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
}

//NOTE: It is recommeded to close the scanner object once the input is taken using the close method.