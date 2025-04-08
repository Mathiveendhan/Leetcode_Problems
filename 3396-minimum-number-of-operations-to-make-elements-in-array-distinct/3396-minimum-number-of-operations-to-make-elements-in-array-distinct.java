class Solution {
    public int minimumOperations(int[] nums) {
       List<Integer> l1=new ArrayList<>();
       for(int num:nums){
        l1.add(num);
       }
       int count=0;
       while(true){
            Set<Integer> hs=new HashSet<>(l1);
            if(hs.size()==l1.size()){
                break;
            }
            int remCount=Math.min(3,l1.size());
            for(int i=0;i<remCount;i++){
                l1.remove(0);
            }
            count++;
       }
       return count;
    }
}