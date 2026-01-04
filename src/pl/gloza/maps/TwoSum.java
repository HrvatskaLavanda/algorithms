package pl.gloza.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int missing = target - nums[i];
            if (valueToIndex.containsKey(missing)) {
                return new int[]{i, valueToIndex.get(missing)};
            } else {
                valueToIndex.put(nums[i], i);
            }
        }
        return new int[]{0, 0}; // to sie nigdy nie stanie
    }

    public static int[] twoSum2(int[] nums, int target) {
        int[] foundValues = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    foundValues[0] = i;
                    foundValues[1] = j;
                    return foundValues;
                }
            }
        }
        return new int[]{0, 0};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums1 = {-3, 4, 3, 90};
        int[] nums3 = {3, 2, 4};


        int[] values = twoSum(nums3, 6);
        System.out.println("TwoSum: " + Arrays.toString(values));

        long startTime = System.nanoTime();
        int[] values2 = twoSum2(nums3, 6);
        long endTime = System.nanoTime();
        long duration = endTime - startTime;

        System.out.println("TwoSum2: " + Arrays.toString(values2));
        System.out.println("Time of TwoSum2: " + duration + " ns");
    }
}
