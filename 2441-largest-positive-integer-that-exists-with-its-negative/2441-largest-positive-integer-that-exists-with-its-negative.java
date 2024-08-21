class Solution {
    public int findMaxK(int[] nums) {
       ArrayList<Integer> pos=new ArrayList<>();
       ArrayList<Integer> neg=new ArrayList<>();
       for(int it:nums){
           if(it>0){
               pos.add(it);
           }else{
               neg.add(it);
           }
       }
       Collections.sort(pos);
       Collections.sort(neg);
       for(int i=pos.size()-1;i>=0;i--){
           int num=pos.get(i);
           int numm=-1*num;
           if(neg.contains(numm)){
               return num;
           }
       }
      return -1;
    }
}