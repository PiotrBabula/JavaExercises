package Exercises.SimpleCalc;

import java.util.Scanner;

public class SimpleCalc {
    //TODO: Make a simple calculator that reads numbers from keyboard and performs the operations:
    // sum, difference, ratio, quotient and modulo.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Simple calculator: sum, difference, ratio, quotient, modulo.\n");

        System.out.println("Enter the first number");
        double a = scanner.nextInt();

        System.out.println("Enter the second number");
        double b = scanner.nextInt();

        double sum = a + b;
        double difference = a - b;
        double ratio = a * b;
        double quotient = a / b;
        double modulo = a % b;

        System.out.println("Sum " + a + " & " + b + " = " + sum);
        System.out.println("Difference " + a + " & " + b + " = " + difference);
        System.out.println("Ratio " + a + " & " + b + " = " + ratio);
        System.out.println("Quotient " + a + " & " + b + " = " + quotient);
        System.out.println("Modulo " + a + " & " + b + " = " + modulo);
    }
}
