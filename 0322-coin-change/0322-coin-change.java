class Solution {
    public static int call(int idx, int[] coins, int amount,HashMap<String,Integer> map) {
        if (idx==coins.length || amount<0) {
            return  Integer.MAX_VALUE/2;
        }
        if (amount == 0) {
           return 0;
        }
        String str=idx+" "+amount;
        if(map.containsKey(str)){
            return map.get(str);
        }
        //steps++;
        int l=1+call(idx, coins, amount - coins[idx],map);
        //steps--;
        int r=call(idx + 1, coins, amount,map);
        int ans=Math.min(l,r);
        map.put(str,ans);
        return ans;
    }

    public int coinChange(int[] coins, int amount) {
        HashMap<String,Integer> map=new HashMap<>();
        int a=call(0, coins,amount,map);
        return a>=Integer.MAX_VALUE/2?-1:a;
    }
}
// class Solution {
//     public static void call(int idx, int[] coins, int amount, int[] count, int steps) {
//         if (idx==coins.length || amount<0) {
//             return;
//         }
//         if (amount == 0) {
//             count[0] = Math.min(count[0], steps);
//         }
//        // steps++;
//         call(idx, coins, amount - coins[idx], count, steps+1);
//        // steps--;
//         call(idx + 1, coins, amount, count, steps);
//     }

//     public int coinChange(int[] coins, int amount) {
//         int[] count = { Integer.MAX_VALUE };
//         call(0, coins, amount, count, 0);
//         return count[0]==Integer.MAX_VALUE?-1:count[0];
//     }
// }