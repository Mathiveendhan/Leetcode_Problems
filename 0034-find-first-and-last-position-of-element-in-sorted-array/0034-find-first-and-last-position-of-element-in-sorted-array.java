class Solution {
    public int[] searchRange(int[] nums, int target) {
         int l=0;
        int[] ans=new int[]{-1,-1};
        int r=nums.length-1;
        int f=0;
        int s=0;
        while(l<nums.length && r>=0){
            if(f==0 && nums[l]==target){
                ans[0]=l;
                f=1;
            }
            l++;
            if(s==0 && nums[r]==target){
                ans[1]=r;
                s=1;
            }
            r--;
            if(f==1 && s==1){
                break;
            }
        }
        return ans;
    }
}