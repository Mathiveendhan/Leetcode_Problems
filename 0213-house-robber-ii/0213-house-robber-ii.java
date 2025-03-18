class Solution {
    public static int call(int[] nums) {
        if (nums.length == 0)
            return 0;
        if (nums.length == 1)
            return nums[0];
        if (nums.length == 2)
            return Math.max(nums[0], nums[1]);

        int prev2 = nums[0];
        int prev = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            int take = nums[i] + prev2;
            int skip = prev;
            int cur = Math.max(take, skip);

            prev2 = prev;
            prev = cur;
        }
        return prev;
    }

    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int[] arr1 = new int[nums.length - 1];
        int[] arr2 = new int[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            arr1[i] = nums[i];
        }
        for (int j = 1; j < nums.length; j++) {
            arr2[j - 1] = nums[j];
        }

        int ans1 = call(arr1);
        int ans2 = call(arr2);

        return Math.max(ans1, ans2);
    }
}

// class Solution {
// public static int call(int[] nums, int n, int[] dp) {
// if (n < 0)
// return 0;
// if (n == 0)
// return nums[0];
// if (n == 1)
// return Math.max(nums[0], nums[1]);

// dp[0] = nums[0];
// dp[1] = Math.max(nums[0], nums[1]);
// for (int i = 2; i < nums.length; i++) {

// int fs = nums[i] + dp[i - 2];
// int ss = 0 + dp[i - 1];
// dp[i] = Math.max(fs, ss);
// }
// return dp[nums.length - 1];
// }

// public int rob(int[] nums) {
// int[] dp = new int[nums.length];
// Arrays.fill(dp, -1);
// int[] arr1 = new int[nums.length - 1];
// int[] arr2 = new int[nums.length - 1];
// for (int i = 0; i < nums.length - 1; i++) {
// arr1[i] = nums[i];
// }
// for (int j = 1; j < nums.length; j++) {
// arr2[j - 1] = nums[j];
// }

// int ans1 = call(arr1, arr1.length - 1, dp);
// Arrays.fill(dp, -1);
// int ans2 = call(arr2, arr2.length - 1, dp);

// return Math.max(ans1, ans2);
// }
// }

// class Solution {
// public static int call(int[] arr,int n,int[] dp){
// if(n<0){
// return 0;
// }
// if(dp[n]!=-1){
// return dp[n];
// }
// if(n==0){
// return arr[0];
// }
// int fs=arr[n]+call(arr,n-2,dp);
// int ss=0+call(arr,n-1,dp);
// return dp[n]=Math.max(fs,ss);
// }
// public int rob(int[] nums) {
// int[] dp=new int[nums.length];
// Arrays.fill(dp,-1);
// int[] arr1=new int[nums.length-1];
// int[] arr2=new int[nums.length-1];
// for(int i=0;i<nums.length-1;i++){
// arr1[i]=nums[i];
// }
// for(int j=1;j<nums.length;j++){
// arr2[j-1]=nums[j];
// }

// int ans1=call(arr1,arr1.length-1,dp);
// Arrays.fill(dp,-1);
// int ans2=call(arr2,arr2.length-1,dp);

// return Math.max(ans1,ans2);
// }
// }