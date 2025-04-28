class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l = 0, r = k - 1;
        double sum = 0;
        int q = 0;
        
        while (q < k) {
            sum += nums[q];
            q++;
        }
        
        double maxi = sum / k;
        
        while (r < nums.length - 1) {
            sum -= nums[l];
            l++;
            r++;
            sum += nums[r];
            maxi = Math.max(maxi, sum / k);
        }
        
        return maxi;
    }
}
