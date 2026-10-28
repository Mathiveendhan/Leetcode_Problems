class Solution {
    static boolean call(int[] nums,int idx, HashMap<Integer,Boolean> map){
        if(idx==nums.length-1){
            return true;
        }
        if(idx>=nums.length-1){
            return false;
        }
        if(map.containsKey(idx)){
            return map.get(idx);
        }
        for(int i=1;i<=nums[idx];i++){
            if(call(nums,idx+i,map)){
                map.put(idx,true);
                return true;
            }
        }
        map.put(idx,false);
        return false;
    }
    public boolean canJump(int[] nums) {
        HashMap<Integer,Boolean> map=new HashMap<>();
        return call(nums,0,map);
    }
}