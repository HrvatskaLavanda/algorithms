package pl.gloza.recursion;

import java.util.Random;

public class SumElements {
    public static int sumElements(int[] tab) {
        int sum = 0;
        for (int i = 0; i < tab.length; i++) {
            sum += tab[i];
        }
        return sum;
    }

    public static int sumElementsRecursive(int[] tab, int index, int sum) {
        if (index >= tab.length) {
            return sum;
        }
        sum += tab[index];
        index++;
        return sumElementsRecursive(tab, index, sum);
    }

    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt();
        }

        int sum = sumElements(tab);
        System.out.println("With for loop: " + sum);
        int sumRecursive = sumElementsRecursive(tab, 0, 0);
        System.out.println("Recursion: " + sumRecursive);
    }
}
