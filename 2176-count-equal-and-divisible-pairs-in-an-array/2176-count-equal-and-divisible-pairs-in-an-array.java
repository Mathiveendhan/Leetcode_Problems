class Solution {
    public static int call(int target, int[] nums, int idx, int k) {
        int ans = 0;
        for (int i = 0; i < idx; i++) {
            if (nums[i] == target && (i * idx) % k == 0) {
                ans++;
            }
        }
        return ans;
    }

    public int countPairs(int[] nums, int k) {
        int ans = 0;
        for (int i = 0; i < nums.length; i++) {
            ans += call(nums[i], nums, i, k);
        }
        return ans;
    }
}
