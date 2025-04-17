import java.util.Arrays;

class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestSum = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(target - sum) < Math.abs(target - closestSum)) {
                    closestSum = sum;
                }
                if (sum < target) {
                    j++;
                } else {
                    k--;
                }
            }
        }
        return closestSum;
    }
}
// class Solution {
//     public int threeSumClosest(int[] nums, int target) {
//         Arrays.sort(nums);
//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int i=0;i<nums.length;i++){
//             if(i+2<nums.length){
//                 arr.add(nums[i]+nums[i+1]+nums[i+2]);
//             }
//         }
//         arr.add(target);
//         Collections.sort(arr);
//         for(int j=0;j<arr.size();j++){
//             if(arr.get(j)==target  && j+1<=arr.size()-1 && target>=0){
//                 return arr.get(j+1);
//             }else if(arr.get(j)==target  && j-1>=0){
//                 return arr.get(j-1);
//             }
//         }
//         return 0;
//     }
// }

// class Solution {
//     public static void f(int[] nums,int n,ArrayList<Integer> arr,ArrayList<Integer> ans,int count,int sum,int idx){
//         if(count==2 && idx<=n){
//             ans.add(sum);
//         }
//         sum+=nums[idx];
//         arr.add(nums[idx]);
//         f(nums,n,arr,ans,count++,sum,idx++);
//         sum-=nums[idx];
//         arr.remove(arr.size()-1);
//         f(nums,n,arr,ans,count--,sum,idx++);
//     }
//     public int threeSumClosest(int[] nums, int target) {
//        int sum=0;
//        ArrayList<Integer> arr=new ArrayList<>();
//        ArrayList<Integer> ans=new ArrayList<>();
//        f(nums,nums.length,arr,ans,target,0,0,0);
//        ans.add(target);
//        int a=0;
//        Collections.sort(ans);
//        for(int i=0;i<ans.size();i++){
//         if(arr.get(i)==target){
//             a=arr.get(i+1);
//             break;
//         }
//        }
//        return a;
//     }
// }