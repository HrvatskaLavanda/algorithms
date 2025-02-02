package pl.gloza.nanoTime;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTime {
    public static List<Integer> fillArrayList(int size) {
        List<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            arrayList.add(i + 1);
        }
        return arrayList;
    }

    public static List<Integer> removeEvenNumbers(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }
        return numbers;
    }

    //zamień parzyste liczby na 0
    public static List<Integer> updateValue(List<Integer> numbers) {
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                numbers.set(i, 0);
            }
        }
        return numbers;
    }

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        List<Integer> arrayList = fillArrayList(10000);
        List<Integer> updatedList = updateValue(arrayList);
        System.out.println(updatedList);
//        List<Integer> evenNumbers = removeEvenNumbers(arrayList);
//        System.out.println(evenNumbers);


        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time: " + duration + " ns");
    }
}
