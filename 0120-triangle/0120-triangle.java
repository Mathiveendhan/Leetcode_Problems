class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        int[][] dp = new int[n][n];

        for (int j = 0; j < n; j++) {
            dp[n - 1][j] = triangle.get(n - 1).get(j);
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {

                int down = dp[i + 1][j];
                int diagonal = dp[i + 1][j + 1];

                dp[i][j] = triangle.get(i).get(j) + Math.min(down, diagonal);
            }
        }

        return dp[0][0];
    }
}

// class Solution {
//     public static void call(int[] mini,List<List<Integer>> triangle,int triIndex,int idx,int sum,int count,int[][] dp){
//         if(triIndex==triangle.size() && count==triangle.size()){
//             mini[0]=Math.min(mini[0],sum);
//             return;
//         }
//         //if(dp[triIndex][idx]!=-1){
//         if(dp[triIndex][idx]!=-1 && sum>=dp[triIndex][idx]) {
//             return;
//         }
//         dp[triIndex][idx]=sum;

//         for(int i=idx;i<=idx+1 && i<triangle.get(triIndex).size();i++){
//             int element=triangle.get(triIndex).get(i);
//             sum+=element;
//             count++;
//             call(mini,triangle,triIndex+1,i,sum,count,dp);
//             sum-=element;
//             count--;
//         }
//     }
//     public int minimumTotal(List<List<Integer>> triangle) {
//       int[] mini=new int[1];
//       mini[0]=Integer.MAX_VALUE;
//       int[][] dp=new int[triangle.size()][triangle.size()];
//       for(int[] i:dp){
//         Arrays.fill(i,-1);
//       }
//       call(mini,triangle,0,0,0,0,dp);  
//       return mini[0];
//     }
// }