package pl.gloza.stringOperations;

import java.util.Scanner;

//reverse string by words

//Write a function that takes a sentence (string) and reverses the order of words in that sentence.
// Example input: "Hello World"
// Example output: "World Hello"
public class ReversingWords {
    public static StringBuilder reverseWords(String sentence) {
        StringBuilder reversedSentence = new StringBuilder();
        String[] words = sentence.split(" ");
        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i > 0) {
                reversedSentence.append(" ");
            }
        }
        return reversedSentence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = scanner.nextLine();

        StringBuilder reversedWords = reverseWords(sentence);
        System.out.println(reversedWords);
    }
}
