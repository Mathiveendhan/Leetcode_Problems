class Solution {
    public static void call(int[] nums,List<List<Integer>> ans,List<Integer> arr,boolean[] vis){
       if(arr.size()==nums.length){
        ans.add(new ArrayList<>(arr));
        return;
       } 
       for(int i=0;i<nums.length;i++){
        if(!vis[i]){
            vis[i]=true;
            arr.add(nums[i]);
            call(nums,ans,arr,vis);
            vis[i]=false;
            arr.remove(arr.size()-1);
        }
       }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        boolean[] vis=new boolean[nums.length];
        call(nums,ans,arr,vis);
        return ans;
    }
}