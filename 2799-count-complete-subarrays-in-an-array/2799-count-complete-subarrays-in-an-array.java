class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        Set<Integer> totalSet = new HashSet<>();
        for (int num : nums) {
            totalSet.add(num);
        }
        int totalUnique = totalSet.size();
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            Set<Integer> windowSet = new HashSet<>();
            for (int j = i; j < n; j++) {
                windowSet.add(nums[j]);
                if (windowSet.size() == totalUnique) {
                    count++;
                }
            }
        }
        return count;
    }
}


// class Solution {
//     public static boolean call(int[] nums,int start,int end,int size){
//         HashSet<Integer> set=new HashSet<>();
//         for(int i=start;i<=end;i++){
//             set.add(nums[i]);
//         }
//         return set.size()==size;
//     }
//     public int countCompleteSubarrays(int[] nums) {
//       HashSet<Integer> set=new HashSet<>();
//       for(int i:nums){
//         set.add(i);
//       }
//       int start=0;
//       int end=0;
//       int count=0;
//       int len=nums.length;
//       while(start<len){
//         end=start;
//         while(end<len){
//             if(call(nums,start,end,set.size())){
//                 count++;
//             }
//             end++;
//         }
//         start++;
//       }  
//       return count;
//     }
// }

// class Solution {
//     static int count = 0; 

//     public static void f(int idx, HashSet<Integer> set, ArrayList<Integer> arr,
//                          int[] nums, int elementSize) {
//         if (idx == nums.length) {
//             return;
//         }

//         arr.add(nums[idx]);
//         set.add(nums[idx]);

//         if (set.size() == elementSize) {
//             count++;
//         }

//         f(idx + 1, set, arr, nums, elementSize);

//         arr.remove(arr.size() - 1);
//         set.remove(nums[idx]);

//         if (arr.isEmpty()) {
//             f(idx + 1, new HashSet<>(), new ArrayList<>(), nums, elementSize);
//         }
//     }

//     public int countCompleteSubarrays(int[] nums) {
//         count = 0;
//         HashSet<Integer> set = new HashSet<>();
//         for (int i : nums) {
//             set.add(i);
//         }

//         f(0, new HashSet<>(), new ArrayList<>(), nums, set.size());

//         return count;
//     }
// }