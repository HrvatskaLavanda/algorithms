package pl.gloza.nanoTime;

public class ArrayTime {
    public static long fillArray(int size) {
        long startTime = System.nanoTime();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of adding : " + duration + " ns");
        return duration;
    }

    public static long updateValue(int[] array) {
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            array[i] = 999;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of updating : " + duration + " ns");
        return duration;
    }

    public static int[] remove(int[] array) {
        System.out.println("Time of removing : doesn't apply");
        // nie istnieje usuwanie elementów - można tylko zrobić nową tablicę bez elementów do usunięcia, czyli to co niżej
       /* int oddCount = 0;
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
        }*/
        return array;
    }

    public static long readValues(int[] array) {
        long startTime = System.nanoTime();
        for (int i = 0; i < array.length; i++) {
            int r = array[i];
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of reading : " + duration + " ns");
        return duration;
    }

    public static void main(String[] args) {
        for (int size = 100; size <= 10_000; size = size * 10) {
            System.out.println("SIZE = " + size);

            long[] fillResults = new long[3];
            long[] updateResults = new long[3];
            long[] readResults = new long[3];

            double sum = 0;
            double sumUpdated = 0;
            double sumRead = 0;

            for (int i = 0; i < 3; i++) {
                fillResults[i] = fillArray(size);
                sum += fillResults[i];

                int[] array = generate(size);
                updateResults[i] = updateValue(array);
                sumUpdated += updateResults[i];

                readResults[i] = readValues(array);
                sumRead += readResults[i];

                System.out.println();
            }
            double average = sum / fillResults.length;
            System.out.println("Average time of adding: " + average);

            double average1 = sumUpdated / updateResults.length;
            System.out.println("Average time of updating: " + average1);

            double average2 = sumRead / readResults.length;
            System.out.println("Average time of reading: " + average2);
            System.out.println();
        }
    }

    public static int[] generate(int size) {//-> zwraca tablicę o długości size
        return new int[size];
    }
}

