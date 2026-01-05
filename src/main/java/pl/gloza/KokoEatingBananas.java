package pl.gloza;

public class KokoEatingBananas {
    public static int maxValue(int[] tab) {
        int max = tab[0];
        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }
        return max;
    }

    public static int calculateTotalHours(int[] piles, int x) {
        int sum = 0;
        for (int i = 0; i < piles.length; i++) {
            double banana = piles[i] / (double) x; //ten x tylko tutaj będzie jako double a nie int
            double ceil = Math.ceil(banana);
            sum += ceil;
        }
        return sum;
    }

    public int minEatingSpeed(int[] piles, int h) {
        int startIndex = 1;
        int endIndex = maxValue(piles);
        int bananaPerHour = (startIndex + endIndex) / 2;
        while (startIndex <= endIndex) {
            bananaPerHour = (startIndex + endIndex) / 2;
            int calculateTotalHours = calculateTotalHours(piles, bananaPerHour);
            if (calculateTotalHours <= h) {
                endIndex = bananaPerHour - 1;

            } else {
                startIndex = bananaPerHour + 1;
            }
        }
        return startIndex;
    }


    public static void main(String[] args) {
        int[] tab = {3, 6, 7, 11};
        int[] tab1 = {30, 11, 23, 4, 20};
        int maxValue = maxValue(tab);
        System.out.println(maxValue);

        int maxValue1 = maxValue(tab1);
        System.out.println(maxValue1);
        System.out.println();

        System.out.println(calculateTotalHours(tab, 1));
        System.out.println(calculateTotalHours(tab, 2));

    }
}
