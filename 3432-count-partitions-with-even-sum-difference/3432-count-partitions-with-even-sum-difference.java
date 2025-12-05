class Solution {
    public int countPartitions(int[] nums) {
        int ans=0;
        int leftSum=0,rightSum=0;
        int i=0;
        for(int q:nums){
            rightSum+=q;
        }
        while(i<nums.length-1){
            int n=nums[i];
            leftSum+=n;
            rightSum-=n;
            if((leftSum-rightSum)%2==0) ans++;
            i++;
        }
        return ans;
    }
}