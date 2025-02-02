package pl.gloza.nanoTime;

import java.util.LinkedList;
import java.util.List;

public class LinkedListTime {
    public static List<Integer> fillLinkedList(int size) {

        List<Integer> linkedList = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            linkedList.add(i + 1);
        }
        return linkedList;
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

        List<Integer> linkedList = fillLinkedList(10000);
        List<Integer> updatedList = updateValue(linkedList);
        System.out.println(updatedList);
//        List<Integer> evenNumbers = removeEvenNumbers(linkedList);
//        System.out.println(evenNumbers);

        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("Time: " + duration + " ns");
    }
}
