public class Campfire0013 {

    /**
     * 数字转换，罗马数字包含以下七种字符: I = 1， V = 5， X = 10， L = 50，C = 100，D = 500 和 M = 1000。
     * */
    public int romanToInt(String s) {
        int result = 0;
        int i = 0;
        while(i < s.length()) {
            int cur = getValue(s.charAt(i));
            int next = 0;
            if (i + 1 < s.length()) {
                next = getValue(s.charAt(i + 1));
            }

            if (cur < next) {
                result += next - cur;
                i += 2;
            } else {
                result += cur;
                i += 1;
            }
        }
        return result;
    }

    public int getValue(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        Campfire0013 campfire0013 = new Campfire0013();
        System.out.println(campfire0013.romanToInt("IXII"));
    }
}
