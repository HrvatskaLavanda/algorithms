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

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums1 = {-3, 4, 3, 90};

        int[] values = twoSum(nums, 9);
        System.out.println(Arrays.toString(values));

    }
}
