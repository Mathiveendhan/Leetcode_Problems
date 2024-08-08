class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        for(int it:nums){
            ans[i]=it*it;
            i++;
        }
        Arrays.sort(ans);
        return ans;
    }
}