package pl.gloza;

public class BinarySearch {
    public static int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex = (startIndex + endIndex) / 2;

        while (startIndex < nums.length && endIndex >= 0 && endIndex >= startIndex) {
            int middleElement = nums[middleIndex];
            if (middleElement == target) {
                return middleIndex;
            }
            if (middleElement > target) {
                endIndex = middleIndex - 1;
                middleIndex = (startIndex + endIndex) / 2;
            } else {
                startIndex = middleIndex + 1;
                middleIndex = (startIndex + endIndex) / 2;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 3, 5, 9, 12};
        int target = 9;

        int foundIndex = search(nums, target);
        System.out.println(foundIndex);

    }
}
