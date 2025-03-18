class Solution {
    public static boolean call(int[] nums, int l, int r) {
        for (int i = l; i <= r; i++) {
            for (int j = i + 1; j <= r; j++) {
                if ((nums[i] & nums[j]) != 0) { 
                    return false;
                }
            }
        }
        return true;
    }

    public int longestNiceSubarray(int[] nums) {
        int l = 0;
        int r = 0;
        int max = 0;

        while (r < nums.length) { 
            if (call(nums, l, r)) {
                max = Math.max(max, r - l + 1);  
                r++; 
            } else {
                l++;
            }
        }

        return max;
    }
}
