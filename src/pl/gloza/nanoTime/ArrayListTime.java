package pl.gloza.nanoTime;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTime {
    public static long fillArrayList(int size) {
        long startTime = System.nanoTime();
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i + 1);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of adding : " + duration + " ns");
        return duration;
    }

//    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
//        for (int i = 0; i < numbers.size(); i++) {
//            if (numbers.get(i) % 2 == 0) {
//                numbers.remove(i);
//            }
//        }
//        return numbers;
//    }

    public static long removeList(List<Integer> numbers) {
        long startTime = System.nanoTime();
        numbers.clear();
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of removing : " + duration + " ns");
        return duration;
    }

    //zamień parzyste liczby na 0
    public static long updateValue(List<Integer> numbers) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.set(i, 0);
            }
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of updating : " + duration + " ns");
        return duration;
    }

    public static long readValues(List<Integer> numbers) {
        long startTime = System.nanoTime();
        for (int element : numbers) {
            return element;
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time of reading : " + duration + " ns");
        return duration;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(3);
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(6);

        for (int size = 100; size <= 10_000; size = size * 10) {
            System.out.println("SIZE = " + size);

            long[] fillResults = new long[3];
            double sum = 0;

            long[] removeResults = new long[3];
            double sumRemoved = 0;

            long[] updateResults = new long[3];
            double sumUpdated = 0;

            long[] readResults = new long[3];
            double sumRead = 0;

            for (int i = 0; i < 3; i++) {
                fillResults[i] = fillArrayList(size);
                sum += fillResults[i];

                removeResults[i] = removeList(list);
                sumRemoved += removeResults[i];

                updateResults[i] = updateValue(list);
                sumUpdated += updateResults[i];

                readResults[i] = readValues(list);
                sumRead += readResults[i];

                System.out.println();
            }

            double average = sum / fillResults.length;
            System.out.println("Average time of adding: " + average);

            double average1 = sumRemoved / fillResults.length;
            System.out.println("Average time of removing: " + average1);

            double average2 = sumUpdated / fillResults.length;
            System.out.println("Average time of updating: " + average2);

            double average3 = sumRead / fillResults.length;
            System.out.println("Average time of reading: " + average3);

        }
    }
}
