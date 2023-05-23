package Exercises.Primes;

public class Primes {
    //TODO: write prime numbers from 0 to 100.
    static boolean isPrime(int a) {
        if (a < 2) return false;

        for (int i = 2; i <= Math.sqrt(a); i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int begOfPrimeRange = 0;
        int endOfPrimeRange = 100;
        for (int i = begOfPrimeRange; i < endOfPrimeRange; i++) {
            if (isPrime(i)) {
                System.out.println("Number " + i + " is prime");
            }
        }
    }

}
