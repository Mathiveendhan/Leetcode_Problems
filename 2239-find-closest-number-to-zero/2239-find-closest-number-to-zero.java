class Solution {
    public int findClosestNumber(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nums[i]=nums[i]*-1;
            }
        }
        Arrays.sort(nums);
        return nums[0];
    }
}