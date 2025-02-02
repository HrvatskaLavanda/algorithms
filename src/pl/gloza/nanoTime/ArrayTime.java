package pl.gloza.nanoTime;

import java.util.Arrays;

public class ArrayTime {
    public static int[] fillArray(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] removeEvenNumbers(int[] array) {
        int oddCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddCount++;
            }
        }
        int[] oddArray = new int[oddCount];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                oddArray[index] = array[i];
                index++;
            }
        }
        return oddArray;
    }

    //zamień parzyste liczby na 0
    public static int[] updateValue(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                array[i] = 0;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        int[] filledArray = fillArray(10000);
        int[] updatedArray = updateValue(filledArray);
        System.out.println(Arrays.toString(updatedArray));
//        int[] oddNumbers = removeEvenNumbers(filledArray);
//        System.out.println(Arrays.toString(oddNumbers));

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time: " + duration + " ns");
    }
}
