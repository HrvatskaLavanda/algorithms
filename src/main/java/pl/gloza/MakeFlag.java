package pl.gloza;

public class MakeFlag {
    public static String[] makeFlag(int n) {
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
        String[] flagValues = new String[n * 3];
        for (int i = 0; i < values.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < values[i].length; j++) {
                stringBuilder.append(values[i][j]);
            }
            flagValues[i] = stringBuilder.toString();
        }
        return flagValues;
    }

    public static void main(String[] args) {
        ;
        String[] oneDimFlag = makeFlag(4);
        for (int i = 0; i < oneDimFlag.length; i++) {
            System.out.println(oneDimFlag[i]);

        }
    }
}
