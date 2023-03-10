public class Campfire0067 {

    /**
     * 二进制字符串相加
     * */
    public String addBinary(String a, String b) {
        final int ZERO = 48;
        int i = a.length() - 1, j = b.length() - 1;
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (i >= 0 && j >= 0) {
            int cnt = (a.charAt(i) - ZERO) + (b.charAt(j) - ZERO) + k;
            if (cnt >= 2) {
                k = 1;
                sb.append(cnt > 2 ? 1 : 0);
            } else if(cnt == 0) {
                sb.append(0);
                k = 0;
            } else {
                sb.append(1);
                k = 0;
            }
            i--;
            j--;
        }

        while(i >= 0) {
            int cnt = (a.charAt(i) - ZERO) + k;
            if (cnt >= 2) {
                k = 1;
                sb.append(0);
            } else if(cnt == 0) {
                sb.append(0);
                k = 0;
            } else {
                sb.append(1);
                k = 0;
            }
            i--;
        }

        while(j >= 0) {
            int cnt = (b.charAt(j) - ZERO) + k;
            if (cnt >= 2) {
                k = 1;
                sb.append(0);
            } else if(cnt == 0) {
                sb.append(0);
                k = 0;
            } else {
                sb.append(1);
                k = 0;
            }
            j--;
        }

        if (k > 0) {
            sb.append(1);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        Campfire0067 campfire0067 = new Campfire0067();
        System.out.println(campfire0067.addBinary("1111", "1111"));
    }
}
