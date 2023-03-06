public class Campfire0058 {

    /**
     * 最后一个单词长度
     * */
    public int lengthOfLastWord(String s) {
        String str = s.trim();
        int k = str.length() - 1;
        int cnt = 0;
        while(k >= 0) {
            if (str.charAt(k) == ' ') {
                break;
            }
            cnt++;
            k--;
        }
        return cnt;
    }

    public static void main(String[] args) {
        Campfire0058 campfire0058 = new Campfire0058();
        campfire0058.lengthOfLastWord("   fly me   to   the moon  ");
    }


}
