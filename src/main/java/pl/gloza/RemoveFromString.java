package pl.gloza;

//Napisać metodę, która przyjmie Stringa i char i zwróci Stringa bez tegoż chara.
//  public static String removeFromString(String word, char letter). np removeFromString("abbaaaa", 'b') -> "aaaaa"

public class RemoveFromString {

    public static String removeFromString(String word, char letter) {
        var result = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != letter) {
                result.append(word.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String word = "abbaaaa";
        char letter = 'b';

        String newString = removeFromString(word, letter);
        System.out.println(newString);
    }
}
