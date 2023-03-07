import java.util.Arrays;

public class Campfire0066 {

    public int[] plusOne(int[] digits) {
        int k = digits.length - 1;
        int mark = 0;
        while (k >= 0) {
            int t = mark == 0 ? digits[k] + 1 : digits[k] + mark;
            if (t < 10) {
                digits[k] = t;
                mark = 0;
                break;
            }
            digits[k] = 0;
            mark = t / 10;
            k--;
        }

        int[] result;
        if (mark > 0) {
            result = new int[digits.length + 1];
            result[0] = mark;
            System.arraycopy(digits, 0, result, 1, digits.length);
        } else {
            result = Arrays.copyOfRange(digits, 0, digits.length);
        }


        return result;
    }
}
