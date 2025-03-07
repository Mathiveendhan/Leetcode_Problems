class Solution {
    public static void call(int[] nums,boolean[] temp,List<List<Integer>> ans,List<Integer> ds){
        if(ds.size()==nums.length){
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!temp[i]){
                temp[i]=true;
                ds.add(nums[i]);
                call(nums,temp,ans,ds);
                ds.remove(ds.size()-1);
                temp[i]=false;
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> ds=new ArrayList<>();
        boolean[] temp=new boolean[nums.length];
        call(nums,temp,ans,ds);
        return ans;
    }
}