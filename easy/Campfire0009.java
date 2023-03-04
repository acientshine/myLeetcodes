public class Campfire0009 {

    /**
     * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
     * */
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String s = String.valueOf(x);
        int l = 0, r = s.length() - 1;
        while(l < r) {
            if (s.charAt(l) == s.charAt(r)) {
                l++;
                r--;
            } else {
                return false;
            }
        }
        return true;
    }
}
