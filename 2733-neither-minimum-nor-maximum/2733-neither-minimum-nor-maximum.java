class Solution {
    public int findNonMinOrMax(int[] nums) {
       Arrays.sort(nums);
       if(nums.length>=3){
        return nums[1];
       }else{
        return -1;
       }
    }
}