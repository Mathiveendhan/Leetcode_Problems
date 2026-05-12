class Solution {
    public static void call(int[] mini,List<List<Integer>> triangle,int triIndex,int idx,int sum,int count,int[][] dp){
        if(triIndex==triangle.size() && count==triangle.size()){
            mini[0]=Math.min(mini[0],sum);
            return;
        }
        //if(dp[triIndex][idx]!=-1){
        if(dp[triIndex][idx]!=-1 && sum>=dp[triIndex][idx]) {
            return;
        }
        dp[triIndex][idx]=sum;

        for(int i=idx;i<=idx+1 && i<triangle.get(triIndex).size();i++){
            int element=triangle.get(triIndex).get(i);
            sum+=element;
            count++;
            call(mini,triangle,triIndex+1,i,sum,count,dp);
            sum-=element;
            count--;
        }
    }
    public int minimumTotal(List<List<Integer>> triangle) {
      int[] mini=new int[1];
      mini[0]=Integer.MAX_VALUE;
      int[][] dp=new int[triangle.size()][triangle.size()];
      for(int[] i:dp){
        Arrays.fill(i,-1);
      }
      call(mini,triangle,0,0,0,0,dp);  
      return mini[0];
    }
}