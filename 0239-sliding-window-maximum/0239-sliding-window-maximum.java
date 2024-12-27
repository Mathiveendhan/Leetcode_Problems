class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>();
        Deque<Integer> deque = new LinkedList<>();

        for (int idx = 0; idx < nums.length; idx++) {
            int num = nums[idx];

            while (!deque.isEmpty() && deque.getLast() < num) {
                deque.pollLast();
            }
            deque.addLast(num);

            if (idx >= k && nums[idx - k] == deque.getFirst()) {
                deque.pollFirst();
            }

            if (idx >= k - 1) {
                res.add(deque.getFirst());
            }
        }

        return res.stream().mapToInt(i -> i).toArray();        
    }
}








// import java.util.*;
// class Solution {
//     public int[] maxSlidingWindow(int[] nums, int k) {
//         ArrayList<Integer> max=new ArrayList<>();
//         for(int i=0;i<=nums.length-k;i++){
//             int kk=i+k;
//             ArrayList<Integer> arr=new ArrayList<>();
//             for(int j=i;j<kk;j++){
//                 arr.add(nums[j]);
//             }
//             Collections.sort(arr);
//             max.add(arr.get(arr.size()-1));
//         }
//         int[] ans=new int[max.size()];
//         for(int a=0;a<max.size();a++){
//             ans[a]=max.get(a);
//         }

//         return ans;
//     }

// }