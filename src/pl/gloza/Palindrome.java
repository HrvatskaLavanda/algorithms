package pl.gloza;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != (word.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a word: ");
        String word = scanner.nextLine();
        boolean palindrome = isPalindrome(word);
        if (palindrome == true) {
            System.out.println("This word is a palindrome");
        } else {
            System.out.println("This word isn not a palindrome");
        }
    }
}
