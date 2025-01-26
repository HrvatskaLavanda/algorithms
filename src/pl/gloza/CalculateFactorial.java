package pl.gloza;

public class CalculateFactorial {
    private static int calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * calculateFactorial(n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        int factorial = calculateFactorial(n);
        System.out.println(factorial);
    }
}
