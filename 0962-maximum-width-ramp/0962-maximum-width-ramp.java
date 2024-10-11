class Solution {
    public int maxWidthRamp(int[] nums) {
        int maxWidth = 0;
        int n = nums.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (nums[j] >= nums[i]) {
                    maxWidth = Math.max(maxWidth, j - i);
                }
            }
        }
        
        return maxWidth;
    }
}
