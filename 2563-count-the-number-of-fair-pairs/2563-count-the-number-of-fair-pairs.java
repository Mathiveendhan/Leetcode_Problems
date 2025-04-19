import java.util.Arrays;

class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        int n = nums.length;
        long count = 0;

        for (int i = 0; i < n - 1; i++) {
            int left = lower - nums[i];
            int right = upper - nums[i];

            int l = lowerBound(nums, i + 1, n - 1, left);
            int r = upperBound(nums, i + 1, n - 1, right);

            if (l <= r) {
                count += r - l + 1;
            }
        }

        return count;
    }

    private int lowerBound(int[] nums, int start, int end, int target) {
        int l = start, r = end;
        int res = end + 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] >= target) {
                res = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return res;
    }

    private int upperBound(int[] nums, int start, int end, int target) {
        int l = start, r = end;
        int res = start - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] <= target) {
                res = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return res;
    }
}

// class Solution {
//     public int call(int l,int r,int lower,int upper,int[] nums){
//         int ans=0;
//         for(int i=l;i<r;i++){
//             int n=nums[i]+nums[r];
//             if(lower<=n && n<=upper){
//                 ans++;
//             }
//         }
//         return ans;
//     }
//     public long countFairPairs(int[] nums, int lower, int upper) {
//         Arrays.sort(nums);
//         int ans=0;
//         int l=0;
//         int r=nums.length-1;
//         while(l!=r){
//             int n=nums[l]+nums[r];
//             if(lower<=n && n<=upper){
//                 ans+=call(l,r,lower,upper,nums);
//                 r--;
//             }else if(n<lower){
//                 l++;
//             }else if(n>upper){
//                 r--;
//             }
//         }
//         return ans;
//     }
// }

// class Solution {
//     public long countFairPairs(int[] nums, int lower, int upper) {
//         Arrays.sort(nums);
//         int ans=0;
//         int len=nums.length;
//         for(int i=0;i<len;i++){
//             for(int j=i+1;j<len;j++){
//                 int n=nums[i]+nums[j];
//                 if(lower<=n && n<=upper){
//                     ans++;
//                 }else if(n<lower || n>upper){
//                     continue;
//                 }
//             }
//         }
//         return ans;
//     }
// }