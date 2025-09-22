class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int max=0;
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }

        for(int j:nums){
            if(max<map.get(j)) max=map.get(j);
        }
        int count=0;
        for(int k:nums){
            if(map.get(k)==max) count++;
        }
        return count;
    }
}