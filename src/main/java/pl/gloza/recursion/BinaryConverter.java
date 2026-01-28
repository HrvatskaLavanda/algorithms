package pl.gloza.recursion;

public class BinaryConverter {

    public static String toBinaryString(int n) {
        String binaryString = Integer.toBinaryString(n);
        return binaryString;
    }

    public static String toBinaryStringAlgorithm(int n) {
        String bin = "";
        for (int i = n; i > 0; i /= 2) {
            int remainder = i % 2;
            n = n / 2;
            bin = remainder + bin;
        }
        return bin;
    }

    public static String toBinaryStringRecursive(int n, String bin) {
        if (n == 0) {
            return bin;
        }
        int remainder = n % 2;
        n = n / 2;
        bin = remainder + bin;
        return toBinaryStringRecursive(n, bin);
    }

    public static void main(String[] args) {
        String binaryString = toBinaryString(20);
        System.out.println(binaryString);

        System.out.println();

        String stringAlgorithm = toBinaryStringAlgorithm(20);
        System.out.println(stringAlgorithm);

        System.out.println();

        String binaryStringRecursive = toBinaryStringRecursive(20, "");
        System.out.println(binaryStringRecursive);
    }
}
