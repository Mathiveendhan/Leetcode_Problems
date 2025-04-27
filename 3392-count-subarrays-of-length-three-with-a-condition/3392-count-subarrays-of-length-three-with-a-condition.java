class Solution {
    public static boolean check(int a,int b,int c){
        if((a+c)==(b/2.0)){
            return true;
        }
        return false;
    }
    public int countSubarrays(int[] nums) {
       int len=nums.length-3;
       int i=0,count=0;
       while(i<=len){
        if(check(nums[i],nums[i+1],nums[i+2])){
            count++;
        }
        i++;
       }
       return count; 
    }
}