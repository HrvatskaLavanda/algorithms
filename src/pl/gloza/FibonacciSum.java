package pl.gloza;

import java.util.Scanner;

public class FibonacciSum {
    private static int fib(int n) {
        if (n < 0) {
            System.out.println("Number n must be higher than 0");
            return -1;
        }
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    private static int sumFibNums(int n) {
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            sum += fib(i);
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = scanner.nextInt();
        int result = fib(n);
        System.out.println("Fibonacci number: " + result);

        int sumFibNums = sumFibNums(n);
        System.out.println();
        System.out.println("Sum: " + sumFibNums);

        scanner.close();
    }
}
