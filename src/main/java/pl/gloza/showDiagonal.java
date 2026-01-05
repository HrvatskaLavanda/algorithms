package pl.gloza;

public class showDiagonal {
    public static String[] showDiagonal(int n) {
        String[][] tab = new String[n + 1][n + 1];

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][j] = ".";
            }
        }

        for (int i = 0; i < tab.length; i++) {
            for (int j = 0; j < tab[i].length; j++) {
                tab[i][i] = "*"; //lewa przekątna
                tab[i][n - i] = "*"; //prawa przekątna
            }
        }

        String[] filledTab = new String[tab.length];
        for (int i = 0; i < tab.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < tab[i].length; j++) {
                sb.append(tab[i][j]);
            }
            filledTab[i] = sb.toString();
        }
        return filledTab;
    }

    public static void main(String[] args) {
        int n = 4;
        String[] tableWithValues = showDiagonal(n);
        for (int i = 0; i < tableWithValues.length; i++) {
            System.out.println(tableWithValues[i]);
        }

    }
}
