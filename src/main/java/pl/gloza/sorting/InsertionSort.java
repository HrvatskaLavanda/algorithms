package pl.gloza.sorting;

public class InsertionSort {

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

//    public static int[] insertionSort(int[] array) {
//
//    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] nums2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] nums3 = {5, 0, 0, 0, 1, -1};
        int[] nums4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};

    }
}
