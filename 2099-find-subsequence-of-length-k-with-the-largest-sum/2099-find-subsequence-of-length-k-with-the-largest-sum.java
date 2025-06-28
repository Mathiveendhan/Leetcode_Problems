class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int len = nums.length;
        int[] sortedNums = Arrays.copyOf(nums, len);
        Arrays.sort(sortedNums);
        int limit = sortedNums[len - k];
        int limitCount = 0;

        for (int i = len - k; i < len; i++) {
            if (sortedNums[i] == limit) {
                limitCount++;
            }
        }

        int[] result = new int[k];
        int index = 0;

        for (int val : nums) {
            if (val > limit) {
                result[index++] = val;
            } else if (val == limit && limitCount > 0) {
                result[index++] = val;
                limitCount--;
            }
            if (index == k) {
                break;
            }
        }

        return result;
    }
}

// class Solution {
//     public int[] maxSubsequence(int[] nums, int k) {
//         int len=nums.length;
//         if(len==k){
//             return nums.clone();
//         }
//         Arrays.sort(nums);
//        int[] ans=new int[k];
//        int idx=0;
//        for(int i=len-k;i<nums.length;i++){
//         ans[idx]=nums[i];
//         idx++;
//        }
//        return ans;
//     }
// }