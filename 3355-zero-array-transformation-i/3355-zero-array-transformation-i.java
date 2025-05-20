class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int n = nums.length;
        int[] sweep = new int[n+1];
        for(int[] query :queries)
        {
            int l = query[0];
            int r = query[1];
            sweep[l] +=  1;
            sweep[r+1] -= 1;
        }
        for(int i=1;i<=n;i++)
        {
            sweep[i]+=sweep[i-1];
        }
        for(int i=0;i<n;i++)
        {
            if(sweep[i]<nums[i]) return false;
        }
        return true;


    }
}

// class Solution {
//     public static void call(int[] num,int l,int r){
//         while(l<=r){
//            if(num[l]!=0){
//                num[l]--;
//             }
//             l++; 
//         } 
//     }
//     public boolean isZeroArray(int[] nums, int[][] queries) {
//         int[] num=nums.clone();
//         for(int[] arr:queries){
//             call(num,arr[0],arr[1]);
//         }
//         for(int i:num){
//             if(i>0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }