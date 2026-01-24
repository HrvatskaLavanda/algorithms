package pl.gloza.recursion;

public class Factorial {

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }

        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static int factorialRecursive(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    public static void main(String[] args) {
        int result = factorial(6);
        System.out.println(result);
        int resultRecursive = factorialRecursive(6);
        System.out.println("Recursion: " + resultRecursive);
    }
}
