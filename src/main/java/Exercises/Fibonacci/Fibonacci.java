package Exercises.Fibonacci;

public class Fibonacci {
    //TODO: write the Fibonacci numbers to 100.
    public static void main(String[] args) {
        final int goal = 100;
        int f1 = 1;
        int f2 = 1;
        for (int i = 0; f2 + f1 < goal; i++) {
            int fibonacciResult;
            if (i == 0) {
                System.out.println(f1);
                System.out.println(f2);
                continue;
            }
            fibonacciResult = f2 + f1;
            System.out.println(fibonacciResult);
            f1 = f2;
            f2 = fibonacciResult;
        }
    }
}
