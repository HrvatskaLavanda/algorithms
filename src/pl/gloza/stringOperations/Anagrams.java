package pl.gloza.stringOperations;

import java.util.Arrays;

//Write a function that checks if two given strings are anagrams
// (i.e., they contain the same letters but in a different order).
// Example input: str1 = "listen", str2 = "silent"
// Example output: true
public class Anagrams {
    public static boolean isAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        boolean isEqual = Arrays.equals(charArray1, charArray2);
        return isEqual;
    }

    public static void main(String[] args) {
        String word1 = "listen";
        String word2 = "silent";

        boolean anagram = isAnagram(word1, word2);
        System.out.println(anagram);
    }
}
