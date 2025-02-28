import java.util.*;

class Solution {
    public void call(int idx,Stack<Integer> stack,int n,int[] arr,List<List<Integer>> ans) {
        if(idx>=n){
            ans.add(new ArrayList<>(stack));
            return;
        }
        stack.push(arr[idx]);
        call(idx+1,stack,n,arr,ans);
        stack.pop();
        call(idx+1,stack,n,arr,ans);
    }

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();  
        Stack<Integer> stack=new Stack<>();
        call(0,stack,nums.length,nums,ans);
        return ans;
    }
}
