package pl.gloza.recursion;

import java.util.Arrays;
import java.util.Random;

public class BinarySearch {

    public static int binarySearch(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;

        for (int i = 0; i < nums.length; i++) {
            int middleIndex = (startIndex + endIndex) / 2;
            int middleElement = nums[middleIndex];

            if (middleElement == target) {
                return middleIndex;
            }
            if (middleElement > target) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }

            if (startIndex > endIndex) {
                return -1;
            }
        }
        return -1;
    }


    public static int binarySearchRecursive(int[] nums, int target, int startIndex, int endIndex) {
        //kiedy ma wyjść, stop
        if (startIndex > endIndex) {
            return -1;
        }

        int middleIndex = (startIndex + endIndex) / 2;
        int middleElement = nums[middleIndex];

        if (middleElement == target) {
            return middleIndex;
        }

        if (middleElement > target) {
            endIndex = middleIndex - 1;
            return binarySearchRecursive(nums, 100, startIndex, endIndex);
        } else {
            startIndex = middleIndex + 1;
            return binarySearchRecursive(nums, 100, startIndex, endIndex);
        }


    }

    public static void main(String[] args) {
        int[] nums2 = {-5, 7, -2, -5, -100, 100, 52, 150};
        int[] nums3 = {5, 0, 0, 0, 1, -1};
        int[] nums4 = {0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0};

        Random rand = new Random();
        int[] nums = new int[100];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt();
        }

        Arrays.sort(nums);
        int result = binarySearch(nums, 100);
        System.out.println(result);

        int resultRecursion = binarySearchRecursive(nums, 100, 0, nums.length - 1);
        System.out.println(resultRecursion);
    }
}
