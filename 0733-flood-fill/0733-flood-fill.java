class Solution {
    public static void call(int r,int c,int[][] ans,int Ccolor,int Ncolor){
        int[]  row={-1,0,1,0};
        int[] col={0,1,0,-1};
        ans[r][c]=Ncolor;
        for(int i=0;i<row.length;i++){
            int rrow=r+row[i];
            int ccol=c+col[i];
            if((rrow>=0 && ccol>=0) && (rrow<ans.length && ccol<ans[0].length) && ans[rrow][ccol]==Ccolor && ans[rrow][ccol]!=Ncolor){
                call(rrow,ccol,ans,Ccolor,Ncolor);
            }
        }
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
       int[][] ans=image;
       int Ccolor=ans[sr][sc];
       call(sr,sc,ans,Ccolor,color);
       return ans;  
    }
}


// class Solution {
//     public static void dfs(int[][] ans,int[][] image,int unicolor,int color,int row,int col){
//         ans[row][col]=color;
//         for(int i=-1;i<=1;i++){
//             for(int j=-1;j<=1;j++){
//                 int r=row+i;
//                 int c=col+j;
//                 if((i == 0 || j == 0) && !(i != 0 && j != 0) && i!=j && c>=0 && c<ans[0].length && r>=0 && r<ans.length && image[r][c]==unicolor && ans[r][c]!=color){
//                     dfs(ans,image,unicolor,color,r,c);
//                 }
//             }
//         }
//     }
//     public int[][] floodFill(int[][] image, int sr, int sc, int color) {
//       int[][] ans=image;
//       int unicolor=image[sr][sc];
//       dfs(ans,image,unicolor,color,sr,sc);
//       return ans;
//     }
// }