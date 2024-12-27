class Solution {
    public int singleNonDuplicate(int[] nums) {
      HashSet<Integer> set=new HashSet<>();
      HashMap<Integer,Integer> map=new HashMap<>();
      for(int i:nums){
        if(!set.contains(i)){
            set.add(i);
            map.put(i,1);
        }else{
            map.put(i,map.get(i)+1);
        }
      }  
      for(int j:nums){
        if(map.get(j)==1){
            return j;
        }
      }
      return 0;
    }
}