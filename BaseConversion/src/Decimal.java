public class Decimal {
    public static int convert(int obase, String onum) {
        int deci = 0;
        String onum1 = onum;
        int count = onum.length();
        char[] digits = new char[count];
        onum1 = onum;
        int i = 0;
        while (i<onum1.length()) {
            digits[i] = onum.charAt(i);
            i++;
        }
        i--;
        int j = 0;
        while (count>0) {
            deci = deci + Character.getNumericValue(digits[i]) * Math.powExact(obase,j);
            i--;
            j++;
            count--;
        }
        return deci;
    }
}