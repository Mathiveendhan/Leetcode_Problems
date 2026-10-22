class Solution {
    public static int steps(int n,HashMap<Integer,Integer> map){
        if(n==0) return 1;
        if(n<0) return 0;
        if(map.containsKey(n)){
            return map.get(n);
        }
        int oneStep=steps(n-1,map);
        int twoStep=steps(n-2,map);
        map.put(n,oneStep+twoStep);
        return oneStep+twoStep;
    }
    public int climbStairs(int n) {
        HashMap<Integer,Integer> map=new HashMap<>();
        return steps(n,map);
    }
}