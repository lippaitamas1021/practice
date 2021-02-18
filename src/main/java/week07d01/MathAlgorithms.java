package week07d01;

public class MathAlgorithms {

    public static boolean isPrime(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        int divisors = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                divisors++;
            }
        }
        if (divisors == 2) {
            return true;
        }
        return false;
    }

    public static boolean isPrimeOtherWay(int number) {
        if (number < 1) {
            throw new IllegalArgumentException("Wrong parameter");
        }
        if (number == 1 || number % 2 ==0) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
