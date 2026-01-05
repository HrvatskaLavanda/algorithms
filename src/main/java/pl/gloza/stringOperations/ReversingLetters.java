package pl.gloza.stringOperations;

import java.util.Scanner;

//reverse string by characters
public class ReversingLetters {
    public static StringBuilder reverseLetters(String sentence) {
        StringBuilder reversedSentence = new StringBuilder(sentence);
        return reversedSentence.reverse();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write a sentence: ");
        String sentence = scanner.nextLine();

        StringBuilder reversedWords = reverseLetters(sentence);
        System.out.println(reversedWords);
    }
}
