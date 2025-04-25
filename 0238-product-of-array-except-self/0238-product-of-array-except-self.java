class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];
        Arrays.fill(ans, 1);
        int curr = 1;
        for(int i = 0; i < n; i++) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        curr = 1;
        for(int i = n - 1; i >= 0; i--) {
            ans[i] *= curr;
            curr *= nums[i];
        }
        return ans;
    }
}

// class Solution {
//     public int[] productExceptSelf(int[] arr) {
//           int[] ans=new int[arr.length];
//           int i=0,p=1;
//           int len=arr.length;
//           for(int idx=0;idx<len;idx++){
//               if(idx!=i){
//                   p=p*arr[idx];
//               }
//               if(idx==len-1 && i!=len-1){
//                   ans[i]=p;
//                   p=1;
//                   i++;
//                   idx=-1;
//               }
//               if(idx==len-1 && i==len-1){
//                   ans[idx]=p;
//               }
//           }
//           return ans;
//     }
// }


// class Solution {
//     public int[] productExceptSelf(int[] nums) {
//         int[] arr=new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             int mul=1;
//             for(int j=0;j<nums.length;j++){
//                 if(i!=j){
//                     mul=mul*nums[j];
//                 }
//             }
//             arr[i]=mul;
//         }
//         return arr;
//     }
// }