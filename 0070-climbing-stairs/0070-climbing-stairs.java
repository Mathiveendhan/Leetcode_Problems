class Solution {
    public static int call(int n,HashMap<Integer,Integer> map){
        if(n==0){
        return 1;
       } 
       if(n<0){
        return 0;
       }
       if(map.containsKey(n)){
        return map.get(n);
       }
       int firstStep=call(n-1,map);
       int secondStep=call(n-2,map);
       map.put(n,firstStep+secondStep);
       return firstStep+secondStep;
    }
    public int climbStairs(int n) {
     
       HashMap<Integer,Integer> map=new HashMap<>();
       return call(n,map);
    }
}