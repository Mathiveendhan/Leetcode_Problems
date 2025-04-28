class Solution {
    public long countSubarrays(int[] nums, long k) {
        int l=0,r=0;
        long count=0,sum=0;
        while(r<nums.length){
            sum+=nums[r];
            while(sum*(r-l+1) >=k && l<=r){
                sum-=nums[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;

    }
}