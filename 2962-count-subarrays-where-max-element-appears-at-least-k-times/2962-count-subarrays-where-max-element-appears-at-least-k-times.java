class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = 0;
        for (int num : nums) {
            max = Math.max(max, num);
        }
        int n = nums.length;
        long count = 0;
        int left = 0, freq = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] == max) {
                freq++;
            }
            while (freq >= k) {
                count += (n - right);
                if (nums[left] == max) {
                    freq--;
                }
                left++;
            }
        }

        return count;
    }
}


// class Solution {
//     public long countSubarrays(int[] nums, int k) {
//         int max=0;
//         for(int q:nums){
//             max=Math.max(max,q);
//         }
//         //System.out.print(max);
//         int l=0,r=0,ans=0,Melement=0;
//         while(r<nums.length){
//             if(nums[r]==max){
//                 Melement++;
//                 if(Melement>=k){
//                     ans++;
//                 }
//             }
//             r++;
//             while(r==nums.length && l<nums.length){
//                 if(Melement>=k){
//                         ans++;
//                     }
//                 if(nums[l]==max){
//                     Melement--;
//                 }
//                 l++;
//             }
//         }
//         return ans;
//     }
// }