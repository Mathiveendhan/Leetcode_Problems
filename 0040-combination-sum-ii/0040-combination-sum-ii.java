class Solution {
    public static void call(int idx,List<List<Integer>> ans,List<Integer> arr,int target,int[] candidates){
        if(target==0){
            ans.add(new ArrayList<>(arr));
            return;
        }
        for(int i=idx;i<candidates.length;i++){
            if(i>idx && candidates[i]==candidates[i-1]) continue;
            if(candidates[i]>target){
                break;
            }
            arr.add(candidates[i]);
            call(i+1,ans,arr,target-candidates[i],candidates);
            arr.remove(arr.size()-1);           
        }
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
       List<List<Integer>> ans=new ArrayList<>();
       List<Integer> arr=new ArrayList<>();
       Arrays.sort(candidates);
       call(0,ans,arr,target,candidates);
       return ans;
    }
}