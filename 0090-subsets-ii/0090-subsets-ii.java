import java.util.*;

class Solution {
    public void call(int idx, List<Integer> list, int n, int[] arr, List<List<Integer>> ans) {
        if (idx >= n) {
            ans.add(new ArrayList<>(list));  // Add the current subset to the answer list
            return;
        }

        // Include the current element in the subset
        list.add(arr[idx]);
        call(idx + 1, list, n, arr, ans);

        // Exclude the current element from the subset
        list.remove(list.size() - 1);

        // Skip over duplicate elements to prevent generating duplicate subsets
        while (idx + 1 < n && arr[idx] == arr[idx + 1]) {
            idx++;
        }
        call(idx + 1, list, n, arr, ans);
    }

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();  // List to store all subsets
        List<Integer> list = new ArrayList<>();  // List to build the current subset
        
        Arrays.sort(nums);  // Sort the array to handle duplicates
        
        call(0, list, nums.length, nums, ans);  // Start the recursion
        return ans;
    }
}
