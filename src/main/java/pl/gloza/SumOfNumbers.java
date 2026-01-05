package pl.gloza;

import java.util.Scanner;

public class SumOfNumbers {
    public static int sumNumbersFromEvenIndex(int[] numbers) {
        int sum = 0;
        for (int i = 2; i < numbers.length; i++) {
            if (i % 2 == 0) {
                sum += numbers[i];
            }
        }
        return sum;
    }

    public static int sumAllNumbers(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number: ");
        int n = scanner.nextInt();

        System.out.println("Give " + n + " numbers: ");
        int[] numbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }

        int sumNumbersFromEvenIndex = sumNumbersFromEvenIndex(numbers);
        int sumAllNumbers = sumAllNumbers(numbers);
        System.out.println("Sum of numbers from even index: " + sumNumbersFromEvenIndex);
        System.out.println("Sum of all numbers:  " + sumAllNumbers);
    }
}
