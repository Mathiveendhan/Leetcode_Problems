class Solution {
    public int findNumbers(int[] nums) {
       int ans=0;
       for(int i:nums){
        String str=""+i;
        if(str.length()%2==0){
            ans++;
        }
       } 
       return ans;
    }
}