package pl.gloza;

public class FindIndex {
    public static int indexOf(int[] tab, int number) {
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == number) {
                return i;
            }
        }
        return -1;
    }

}



