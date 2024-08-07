class Solution {
    Set<Integer> q=new HashSet<>();
    public int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
          if(q.contains(nums[i])){
            return nums[i];
          }else{
            q.add(nums[i]);
          }
        }
        return 0;
    }
}