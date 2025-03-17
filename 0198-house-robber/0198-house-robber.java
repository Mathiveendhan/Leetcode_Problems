class Solution {
    public static int call(int[] nums, int i,int[] dp) {
        if (i < 0) {
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
            int fs = call(nums, i - 2,dp) + nums[i];
            int ss = 0 + call(nums, i - 1,dp);
        return dp[i]=Math.max(fs,ss);
    }

    public int rob(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return call(nums, nums.length - 1,dp);
    }
}