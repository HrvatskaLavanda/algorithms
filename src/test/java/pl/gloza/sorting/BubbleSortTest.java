package pl.gloza.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class BubbleSortTest {
    // 1. przetestowałabym czy rzeczywiście sortuje
    // 2. wydajność dla długości tablicy 10, 100, 1000, 10_000 elementów
    //3. czy tablica nie jest pusta

    @Test
    void shouldBubbleSortCorrectly() {
        //given
        int[] nums = {1, 2, 5, 4, 10, 10, -1, 5};
        int[] expected = nums.clone();
        Arrays.sort(expected);

        //when
        int[] sortedNums = BubbleSort.bubbleSort(nums);

        //then
        Assertions.assertNotNull(sortedNums, "Array is null");
        Assertions.assertArrayEquals(expected, sortedNums);

    }
}