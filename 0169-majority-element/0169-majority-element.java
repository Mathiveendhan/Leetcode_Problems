class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer,Integer> map=new HashMap<>();
       for(int q:nums){
        if(!map.containsKey(q)){
            map.put(q,1);
        }else{
            map.put(q,map.get(q)+1);
        }
       }
      int ans=0;
      int max=Integer.MIN_VALUE;
      for(int i:nums){
        if(max<map.get(i)){
            max=map.get(i);
            ans=i;
        }
      }
      return ans;
    }
}

// class Solution {
//     public int majorityElement(int[] nums) {
//         int candidate = nums[0];
//         int count = 1;
        
       
//         for (int i = 1; i < nums.length; i++) {
//             if (count == 0) {
//                 candidate = nums[i];
//             }
//             if (nums[i] == candidate) {
//                 count++;
//             } else {
//                 count--;
//             }
//         }
       
//         return candidate;
//     }
// }
    
   