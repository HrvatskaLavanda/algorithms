package pl.gloza;

public class MakeFlag {
    public static String[][] makeFlag(int n) {
        String[][] values = new String[n * 3][n];
        for (int i = 0; i < n * 3; i++) {
            for (int j = 0; j < n; j++) {
                if ((i + 1) % 3 != 0) {
                    values[i][j] = "*";
                } else {
                    values[i][j] = "x";
                }
            }
        }
        return values;
    }

    public static void printFlag(String[][] values) {
        for (int i = 0; i < values.length; i++) {
            for (int j = 0; j < values[i].length; j++) {
                System.out.print(values[i][j]);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[][] flag = makeFlag(2);
        printFlag(flag);
    }
}
