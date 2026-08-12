class Solution {
    public int maxSubarrayLength(int[] num, int k) {
       HashMap<Integer,Integer> map=new HashMap<>();
       int l=0,r=0,max=Integer.MIN_VALUE; 
       while(r<num.length){
        map.put(num[r],map.getOrDefault(num[r],0)+1);
        while(map.get(num[r])>k){
            map.put(num[l],map.get(num[l])-1);
            l++;
        }
        max=Math.max(max,r-l+1);
        r++;
       }
       return max;
    }
}