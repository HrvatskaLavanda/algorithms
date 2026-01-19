package pl.gloza.recursion;

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
        int[] nums = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] nums2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] nums3 = {5, 0, 0, 0, 1, -1};
        int[] nums4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};

        int sum = sumElements(nums);
        System.out.println("With for loop: " + sum);
        int sumRecursive = sumElementsRecursive(nums, 0, 0);
        System.out.println("Recursion: " + sumRecursive);
    }
}
