class Solution {
    public int findPeakElement(int[] nums) {
       int max=0;
       int[] co=nums;
       Arrays.sort(co);
       int maxx=co[co.length-1];
       for(int i=0;i<nums.length;i++){
        if(maxx==nums[i]){
            return i-1;
        }
      }
      return -1; 
    }
}