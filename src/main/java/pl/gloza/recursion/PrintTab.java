package pl.gloza.recursion;

public class PrintTab {
    void printTab(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    void printTabRecursive(int[] tab, int index) {
        //kiedy jest źle, kiedy jest koniec
        if (index >= tab.length) {
            return;
        }
        System.out.println(tab[index]);
        index++;
        printTabRecursive(tab, index);
    }
}
