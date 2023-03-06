import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Campfire0026 {


    /**
     * 原地删除，快慢指针
     */
    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }

    public static void main(String[] args) {
        Campfire0026 campfire0026 = new Campfire0026();
        campfire0026.removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4});
        campfire0026.removeDuplicates(new int[]{1, 1, 2});
    }
}
