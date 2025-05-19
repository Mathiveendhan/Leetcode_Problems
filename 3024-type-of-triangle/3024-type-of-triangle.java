class Solution {
    public String triangleType(int[] nums) {
        int a = nums[0], b = nums[1], c = nums[2];
        if (a + b <= c || a + c <= b || b + c <= a) return "none";
        if (a == b && b == c) return "equilateral";
        if (a == b || b == c || a == c) return "isosceles";
        return "scalene";
    }
}

// class Solution {
//     public String triangleType(int[] nums) {
//         Arrays.sort(nums);
//         if(nums[0]+nums[1]<=nums[2]){
//             return "none";
//         }
//         HashSet<Integer> set=new HashSet<>();
//         for(int i:nums){
//             set.add(i);
//         }
//         if(set.size()==1){
//             return "equilateral";
//         }else if(set.size()==2){
//             return "isosceles";
//         }else{
//             return "scalene";
//         }
//     }
// }