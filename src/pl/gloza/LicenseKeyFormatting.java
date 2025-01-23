package pl.gloza;

public class LicenseKeyFormatting {
    public String licenseKeyFormatting(String s, int k) {
        StringBuilder newString = new StringBuilder();
        int counter = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '-') {
                if (counter == k) {
                    newString.append('-');
                    counter = 0;
                }
                newString.append(Character.toUpperCase(s.charAt(i)));
                counter++;
            }
        }
        return newString.reverse().toString();
    }

    public static void main(String[] args) {
        String s = "2-5g-3-J";
        int k = 2;
        LicenseKeyFormatting lkf = new LicenseKeyFormatting();
        String s1 = lkf.licenseKeyFormatting(s, k);
        System.out.println(s1);
    }
}
