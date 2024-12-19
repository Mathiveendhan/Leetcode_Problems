import java.util.*;

class Solution {
    public void rotate(int[] nums, int k) {
        // Queue to simulate the rotation
        Queue<Integer> q = new LinkedList<>();
        
        // Add all elements from nums to the queue
        for (int i : nums) {
            q.add(i);
        }

        // Create an ArrayList to hold the rotated elements
        ArrayList<Integer> arr = new ArrayList<>();

        // Add the last k elements of the original array to the ArrayList
        for (int j = nums.length - k; j < nums.length; j++) {
            arr.add(nums[j]);
        }

        // Add the remaining elements (first part) of the original array to the ArrayList
        for (int j = 0; j < nums.length - k; j++) {
            arr.add(nums[j]);
        }

        // Now copy the rotated ArrayList back to the original array nums
        for (int i = 0; i < nums.length; i++) {
            nums[i] = arr.get(i);
        }

        // Print the rotated array
        System.out.println(Arrays.toString(nums));
    }
}


// import java.util.Arrays;
// class Solution {
//     // public static void reverse(int[] arr, int start, int end){
//     //     while(start < end){
//     //         int temp = arr[start];
//     //         arr[start] = arr[end];
//     //         arr[end] = temp;
//     //         start++;
//     //         end--;
//     //     }
//     //}
//     public void rotate(int[] nums, int k) {
//         Queue<Integer> q=new LinkedList<>();
//         for(int i:nums){
//             q.add(i);
//         }
//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int j=(nums.length-k);j<nums.length;j++){
//             arr.add(nums[j]);
//         }

//         for(int kk=0;kk<arr.size();kk++){
//             int n=arr.get(kk);
//             q.remove(n);
//             q.add(n);
//         }

//         System.out.println(q);

//         //  int n = nums.length;
//         // k = k % n;
//         // reverse(nums, 0, n - 1);
//         // reverse(nums, 0, k - 1);
//         // reverse(nums, k, n - 1);
//     }
// }

