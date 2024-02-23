import java.util.UUID;

public class Calculator {

    Calculator() {

    }

    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }

    /*
    Returns the n'th number in the Fibonacci sequence
    */
    int fibonacciNumberFinder(int n) {
        if (n <= 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            int a = 0, b = 1;
            for (int i = 2; i <= n; i++) {
                int temp = a;
                a = b;
                b = temp + b;
            }
            return b;
        }
    }

    /*
    Returns binary value of the given int number
    */
    String intToBinaryNumber(int number) {
        return Integer.toBinaryString(number);
    }

    /*
    Create a completely unique String identifier for a given string
    */
    String createUniqueID(String n) {
        return n + UUID.randomUUID().toString().replace("-", "");
    }

}
