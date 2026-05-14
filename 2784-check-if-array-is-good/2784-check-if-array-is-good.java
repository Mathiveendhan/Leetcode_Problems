class Solution {
    public boolean isGood(int[] nums) {
        Arrays.sort(nums);
        if (nums.length < 2) {
            return false;
        }
        int i = 0, element = 1;
        while (i < nums.length - 1) {
            if (nums[i] != element) {
                return false;
            }
            element++;
            i++;
        }
        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return false;
        }
        return true;
    }
}