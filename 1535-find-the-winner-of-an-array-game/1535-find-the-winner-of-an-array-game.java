class Solution {
    public int getWinner(int[] nums, int k) {
        int n = nums.length;
        int i = 0;
        int j = 1;
        int ans = 0;
        while(j < n){            
            if (nums[j] > nums[i]){
                i = j;
                ans = 1;
            }
            else{
                ans++;
            }
            if (ans == k){
                return nums[i];
            }
            j++;
        }
        return nums[i];       
    }
}