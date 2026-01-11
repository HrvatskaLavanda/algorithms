package pl.gloza.sorting;

public class SelectionSort {
    private static int findIndexOfMinElement(int[] array, int startIndex) {
        int minIndex = startIndex; //indeks najmniejszego elementu
        for (int i = startIndex; i < array.length; i++) {
            int minElement = array[startIndex];  //najmniejszy element to ten na samym początku i ustawiam go jako stałą na ten moment
            if (array[i] < minElement) { //sprawdzam czy kolejny jest mniejszy od najmniejszego elementu
                minIndex = i;  //jeśli tak, to szukam indeksu w zadaniu, więc ustawiam nowy indeks najmniejszego elementu
            }
        }
        return minIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] nums2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] nums3 = {5, 0, 0, 0, 1, -1};
        int[] nums4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};

        int indexOfMinElement = findIndexOfMinElement(nums2, 5);
        System.out.println("Index of Min Element: " + indexOfMinElement);
    }
}
