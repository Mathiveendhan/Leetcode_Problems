class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=1;i<n;i++){
            for(int j=i;j<n;j++){
                if(nums[j]+nums[j-i]==target) return new int[]{j-i, j};
            }
        }
        return new int[]{};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        int[] ans=new int[2];
//        for(int i=0;i<nums.length;i++){
//         int a=nums[i];
//         for(int j=i+1;j<nums.length;j++){
//             int b=nums[j];
//             if(a+b==target){
//                 ans[0]=i;
//                 ans[1]=j;
//                 return ans;
//             }
//         }
//        }
//        return ans; 
//     }
// }