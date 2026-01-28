package pl.gloza.recursion;

import java.util.Random;

public class PrintTab {
    public static void printTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void printTabRecursive(int[] tab, int index) {
        //kiedy jest źle, kiedy jest koniec
        if (index >= tab.length) {
            return;
        }
        System.out.println(tab[index]);
        index++;
        printTabRecursive(tab, index);
    }

    //wypisz wszystkie elementy z tab[] intów o długości 50 o losowych wartościach
    public static void main(String[] args) {
        Random rand = new Random();
        int[] tab = new int[50];
        for (int i = 0; i < tab.length; i++) {
            tab[i] = rand.nextInt();
        }

        printTab(tab);
        System.out.println("Recursion: ");
        printTabRecursive(tab, 0);
    }
}
