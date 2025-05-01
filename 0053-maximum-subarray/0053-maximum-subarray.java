class Solution {
    public int maxSubArray(int[] nums) {
        int cur=nums[0];
        int max=nums[0];
        for(int i=1;i<nums.length;i++){
            cur = Math.max(nums[i], cur + nums[i]);
            max = Math.max(max, cur);

            
            //      or

            // if(cur+nums[i]>nums[i]){
            //     cur+=nums[i];
            // }else{
            //     cur=nums[i];
            // }

            // if(cur>max){
            //     max=cur;
            // }
        }
        return max;
    }
}

// class Solution {
//     public int maxSubArray(int[] nums) {
//         int sum = 0; 
//         int max = nums[0];
        
//         for(int i=0; i<nums.length; i++){
//             sum = sum + nums[i];
//             max = Math.max(sum, max);

//             if(sum < 0) sum = 0;
//         }
        
//         return max;
//     }
// }


// class Solution {
//     public int maxSubArray(int[] nums) {
//         int max=Integer.MIN_VALUE;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 sum+=nums[j];
//                 max=Math.max(max,sum);
//             }
//         }
//         return max;
//     }
// }