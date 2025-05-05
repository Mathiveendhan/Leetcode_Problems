class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int n = nums.length;
        int left = -1, right = -1;
        int maxSoFar = Integer.MIN_VALUE, minSoFar = Integer.MAX_VALUE;
        
        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            if (nums[i] < maxSoFar) {
                right = i;
            }
        }
        
        for (int i = n - 1; i >= 0; i--) {
            minSoFar = Math.min(minSoFar, nums[i]);
            if (nums[i] > minSoFar) {
                left = i;
            }
        }
        
        if (left == -1) return 0;
        return right - left + 1;
    }
}
// class Solution {
//     public int findUnsortedSubarray(int[] nums) {
//         int l=0,r=nums.length-2;
//         int a=0,b=0;
//         while(l<=r){
//             if(nums[l]<nums[l+1]){
//                 l++;
//             }else{
//                 a++;
//             }
//             if(nums[r]<nums[r+1]){
//                 r--;
//             }else{
//                 b++;
//             }
//             if(a>0 && b>0){
//                 return (r+l);
//             }
//         }
//         return 0;
//     }
// }