import java.util.HashMap;
import java.util.Map;

public class Campfire0001 {

    /**
     * leetcode 0001
     * */
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> hashtable = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer idx = hashtable.get(nums[i]);
            if (idx != null) {
                result[0] = i;
                result[1] = idx;
                break;
            } else {
                hashtable.put(target - nums[i], i);
            }
        }
        return result;
    }
}
