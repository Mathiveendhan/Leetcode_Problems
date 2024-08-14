public class Solution {
    public int smallestDistancePair(int[] nums, int k) {
        ArrayList<Integer> ans=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int diff = Math.abs(nums[i] - nums[j]);
                ans.add(diff);
            }
        }
        Collections.sort(ans);
        return ans.get(k-1);
    }
}