class Solution {
    public static int call(int n,HashMap<Integer,Integer> map){
        if(n==0){
            return 1;
        }
        if (n < 0) return 0; 
        if (map.containsKey(n)) return map.get(n);
        int ways = call(n - 1, map) + call(n - 2, map);
        map.put(n, ways);
        return ways;
    }
    public int climbStairs(int n) {
        return call(n,new HashMap<>());
    }
}


// class Solution {
//     static int count=0;
//     public static void call(int n){
//         if(n==0){
//             count++;
//             return;
//         }
//         if(n<0) return;
//         call(n-1);
//         call(n-2);
//     }
//     public int climbStairs(int n) {
//        count=0;
//        call(n);
//        return count;
//     }
// }