class Solution {
     public static int memoization(int n,int m,int i,int j,int[][] dp){
        if(i<0 || j<0 || i>=n || j>=m){
            return 0;
        }

        if(i==n-1 && j==m-1){
            return 1;
        }

        if(dp[i][j]!=-1) return dp[i][j];
        dp[i][j]= memoization(n, m, i+1, j,dp) + memoization(n, m, i, j+1,dp);
        return dp[i][j];
    }
    public int uniquePaths(int m, int n) {
        int[][] dp=new int[n][m];
        for(int[] a:dp){
            Arrays.fill(a,-1);
        }
      return (memoization(n,m,0,0,dp));
    }
}


// class Solution {
//     static int rec(int i,int j,int n,int m, HashMap<String,Integer> map){
//         if(i>n || j>m){
//             return 0;
//         }
//         if(i==n-1 && j==m-1){
//             return 1;
//         }
//         String str=i+" "+j;
//         if(map.containsKey(str)){
//             return map.get(str);
//         }
//         int right=rec(i+1, j, n, m,map);
//         int bottom=rec(i, j+1, n, m,map);
//         map.put(str,right+bottom);
//         return right+bottom;
//     }
//     public int uniquePaths(int m, int n) {
//         HashMap<String,Integer> map=new HashMap<>();
//         return rec(0,0,n,m,map);
//     }
// }