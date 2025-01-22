import static pl.gloza.CountChar.countChar;
import static pl.gloza.FindIndex.indexOf;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int[] tab = {1, 2, 3, 4, 5, 6, 7, 9, 10};
        int number = 6;

        int foundIndex = indexOf(tab, number);
        System.out.println("Found index: " + foundIndex);

        String word = "abb";
        char letter = 'b';
        int counterChar = countChar(word, letter);
        System.out.println("Word: " + word + " -> number of letters " + letter + " : " + counterChar);
    }
}