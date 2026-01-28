package pl.gloza;
//Napisania metody, która dostanie jako parametr Stringa i szukany char i zliczy ile razy podany char występuję w Stringu -
// public static int countChar(String word, char letter). np countChar("abb", 'b') -> 2

public class CountChar {
    public static int countChar(String word, char letter) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == letter) {
                count++;
            }
        }
        return count;
    }
}
