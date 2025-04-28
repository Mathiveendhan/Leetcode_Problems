class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0, r = 0, count = 0, sum = 1;
        while (r < nums.length) {
            sum *= nums[r];
            while (sum >= k && l <= r) {
                sum /= nums[l];
                l++;
            }
            count += (r - l + 1);
            r++;
        }
        return count;
    }
}
// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {
//         int l=0,r=0,count=0,sum=1;
//         for(int q=1;q<nums.length-1;q++){
//             if(nums[q]<k){
//                 count++;
//             }
//         }
//         while(r<nums.length){
//             sum*=nums[r];
//             if(sum<k){
//                 count++;
//             }
//             if(sum>=k){
//                 sum/=nums[l];
//                 l++;
//             } 
//             r++;
//             while(r==nums.length && l<nums.length){
//                 sum/=nums[l];
//                 if(sum<k){
//                     count++;
//                 }
//                 l++;
//             }
//         }
//         return count;
//     }
// }