class Solution {
    public int maximumCount(int[] nums) {
        int max=0;
        int min=0;
        int zero=0;
        for(int i:nums){
            if(i==0){
                zero++;
            }else if(i<0){
                min++;
            }else{
                break;
            }
        }
        max=nums.length-(min+zero);
        return Math.max(max,min);
        
    }
}