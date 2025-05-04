class Solution {
public int singleNumber(int[] nums) {
    int result = 0;
    for (int num : nums) {
        result ^= num;
    }
    return result;
 }
}
// class Solution {
//     public int singleNumber(int[] nums) {
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int q:nums){
//             if(!map.containsKey(q)){
//                 map.put(q,1);
//             }else{
//                 map.put(q,map.get(q)+1);
//             }
//         }
//         for(int i:nums){
//             if(map.get(i)==1){
//                 return i;
//             }
//         }
//         return 0;
//     }
// }

// class Solution {
//     public int singleNumber(int[] nums) {
//         int count=0;
//         for(int i=0;i<nums.length;i++){
//             int num=nums[i];
//             for(int j=0;j<nums.length;j++){
//                 if(num==nums[j]){
//                      count++;
//                 }
//             }
//             if(count==1){
//                 return num;
//             }else{
//                 count=0;
//             }
//         }
//         return 0;
//     }
// }