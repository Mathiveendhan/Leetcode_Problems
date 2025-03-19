class Solution {
    public int firstMissingPositive(int[] nums) {
     int[] temp=nums.clone();
     Arrays.sort(temp);
     int start=1;
     for(int i:temp){
        if(start==i){
            start++;
        }
     }
    
     return start;
  } 
}