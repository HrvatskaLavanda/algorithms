package pl.gloza;

import java.util.*;

public class TopKFrequentElements {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        Map<Integer, List<Integer>> reversedMap = new TreeMap<>(Comparator.reverseOrder()); //reverse sorting; reason: default sorting is from smallest to largest
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int numberFromTab = entry.getKey();
            int frequency = entry.getValue();

            //frequency (K) - list of numbers (V)
            if (!reversedMap.containsKey(frequency)) {
                //Frequency not found? We need to create a new list for this frequency
                reversedMap.put(frequency, new ArrayList<>());
            }
            //frequency found, just add the number to the existing list
            reversedMap.get(frequency).add(numberFromTab);
        }

        int count = 0;
        int[] foundNumbers = new int[k];
        int i = 0;

        //zaglądam do mapy i chodzę po niej
        for (Map.Entry<Integer, List<Integer>> e : reversedMap.entrySet()) {
            //chodzę po liście wartości, i wpisuje element do tablicy
            //aż do momentu gdy count == k, bo tablica jest zapełniona i ją zwracam
            for (Integer element : e.getValue()) {
                if (count == k) {
                    return foundNumbers;
                }
                foundNumbers[i++] = element;
                count++;
            }
        }
        return foundNumbers;
        // znalazłaś największą wartosć wśród wszystkich wartości (3)
        // zatem zwróciłaś jej klucz, czyli 1.
        // potem znalazłaś kolejną największą (pominąwszy wziętą trójkę),
        // zwracasz jej klucz (2).
    }
    // 1,1,1,2,2,3


    // HW: map: (liczba -> jej liczba wystąpień)
    // 1 -> 3
    // 2 -> 2
    // 3 -> 1

    // odwrócenie mapy:
    // liczba wystąpień -> ile liczb tyle razy wystąpiło.
    // Klucze posortowane od największego do najmniejszego. (TreeMapa)
    // 3 -> [1]
    // 2 -> [2]
    // 1 -> [3]

// A, A, B, C, C,
    // inny przykład:
    // A -> 2
    // B -> 1
    // C -> 2

    // po odwróceniu mapy (wystąpienia -> literki). Klucze unikalne ale wartości to lista
    // 2 -> [A, C]
    // 1 -> [B]

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        TopKFrequentElements topKFrequentElements = new TopKFrequentElements();
        int[] mostFrequentElements = topKFrequentElements.topKFrequent(nums, k);
        System.out.println(Arrays.toString(mostFrequentElements));
    }

}
