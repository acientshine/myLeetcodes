public class Campfire0035 {

    /**
     * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
     * 请必须使用时间复杂度为 O(log n) 的算法。
     * 典型二分查找
     * */
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while(l < r) {
            int mid = (l + r) / 2;
            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {

    }
}
