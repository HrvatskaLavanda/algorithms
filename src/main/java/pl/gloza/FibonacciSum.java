package pl.gloza;

import java.util.Scanner;

public class FibonacciSum {
    private static int fibSum(int n) {
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
//            return fib(n - 1) + fib(n - 2); //recursion
            int f0 = 0;
            int f1 = 1;
            int sum = 0;

            for (int i = 2; i <= n; i++) {
                int f3 = f0 + f1;
                f0 = f1;
                f1 = f3;
                sum += f1;
            }
            return sum;
        }
    }

    //for recursice version, change current above method fibSum into fib
//    private static int sumFibNumsRecursive(int n) {
//        int sum = 0;
//        for (int i = 0; i <= n; i++) {
//            sum += fib(i);
//        }
//        return sum;
//    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = scanner.nextInt();

        int result = fibSum(n);
        System.out.println("Fibonacci number: " + result);

        //recursive version:
//        int sumFibNums = sumFibNumsRecursive(n);
//        System.out.println();
//        System.out.println("Sum: " + sumFibNums);

        scanner.close();
    }
}
