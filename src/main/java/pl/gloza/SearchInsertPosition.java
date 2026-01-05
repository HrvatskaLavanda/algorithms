package pl.gloza;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middleIndex = (startIndex + endIndex) / 2;

        while (startIndex < nums.length && endIndex >= 0 && startIndex <= endIndex) {
            int middleElement = nums[middleIndex];
            if (middleElement == target) {
                return middleIndex;
            }
            if (middleElement < target) {
                startIndex = middleIndex + 1;
                middleIndex = (startIndex + endIndex) / 2;
            } else {
                endIndex = middleIndex - 1;
                middleIndex = (startIndex + endIndex) / 2;
            }
        }
        return startIndex;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6, 8};
        int target = 7;
        int currnetInsert = searchInsert(nums, target);
        System.out.println(currnetInsert);
    }
}
