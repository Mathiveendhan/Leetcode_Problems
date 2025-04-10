class Solution {
    public static int call(ArrayList<Integer> arr){
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr.size()==1){
            return arr.get(0);
        }
        for(int i=0;i<arr.size()-1;i++){
            int sum= arr.get(i)+arr.get(i+1);
                ans.add(sum%10);
        }
        return call(ans);
    }
    public int triangularSum(int[] nums) {
    ArrayList<Integer> arr=new ArrayList<>();
    for(int r:nums){
        arr.add(r);
    }
    return call(arr);    
    }
}


// class Solution {
//     public int triangularSum(int[] nums) {
//         int n = nums.length;
//         for (int i = n - 1; i >= 0; i--) {
//             for (int j = 0; j < i; j++) {
//                 nums[j] = (nums[j] + nums[j + 1]) % 10;
//             }
//         }
//         return nums[0];

//     }
// }