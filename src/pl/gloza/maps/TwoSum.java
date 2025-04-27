package pl.gloza.maps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    //utworzyć mapę klucz to suma dwóch cyfr, które są wartością
    //idę po tablicy i sumuję elementy
    //suma 1-go elementu i 2-go elementu to 1 klucz (wartości 1. element i 2. element)
    //suma 2-go elementu i 3-go elementu to 2 klucz (wartości 2. element i 3. element)
    //suma 3-go elementu i 4-go elementu to 3 klucz (wartości 3. element i 4. element)

//    public static int[] twoSum(int[] nums, int target) {
//
//    }

    public static Map<Integer, Integer[]> sumByNumber(int[] nums) {
        Map<Integer, Integer[]> pairsByNumber = new HashMap<>();

        for (int i = 0; i < nums.length - 1; i++) {
            int sum = nums[i] + nums[i + 1];
            Integer[] values = {nums[i], nums[i + 1]};
            pairsByNumber.put(sum, values);
        }
        return pairsByNumber;
    }

    //szukam pary po kluczu
    public static Integer[] findByKey(Map<Integer, Integer[]> pairsByNumber, int target) {
        if (pairsByNumber.containsKey(target)) {
            return pairsByNumber.get(target);
        }
        return null;
    }


    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] nums1 = {3, 2, 4};

        Map<Integer, Integer[]> sumByNumber = sumByNumber(nums);
        for (Map.Entry<Integer, Integer[]> number : sumByNumber.entrySet())
            System.out.println(number.getKey() + " " + Arrays.toString(number.getValue()));

        Integer[] foundValues = findByKey(sumByNumber, 18);
        System.out.println("Found values: " + Arrays.toString(foundValues));

    }
}
