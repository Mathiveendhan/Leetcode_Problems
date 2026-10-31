class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0)
            return 0;
        Set<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }
        int maxLen = 0;
        for (int num : set) {
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int len = 1;
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    len++;
                }
                maxLen = Math.max(maxLen, len);
            }
        }
        return maxLen;
    }
}

// class Solution {
//     public int longestConsecutive(int[] nums) {
//         if(nums.length==0){
//             return 0;
//         }

//         TreeSet<Integer> tree=new TreeSet<>();
//         for(int q:nums){
//             tree.add(q);
//         }
//         int count=1,max=1;
//         Integer[] arr=tree.toArray(new Integer[0]);
//         for(int i=0;i<arr.length-1;i++){
//             if(arr[i]+1==arr[i+1]){
//                 count++;
//             }else{
//                 count=1;
//             }
//             max=Math.max(count,max);
//         }
//     return max;
//     }
// }