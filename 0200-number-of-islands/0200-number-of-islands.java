class Solution {
    public static void dfs(int r,int c,int[][] vis,char[][] grid){
        int[] row={-1,0,1,0};
        int[] col={0,1,0,-1};
        for(int i=0;i<row.length;i++){
            int rrow=r+row[i];
            int ccol=c+col[i];
            if(rrow>=0 && rrow<grid.length && ccol>=0 && ccol<grid[0].length && vis[rrow][ccol]==0 && grid[rrow][ccol]=='1'){
                vis[rrow][ccol]=1;
                dfs(rrow,ccol,vis,grid);
            }
        }
    }
    public int numIslands(char[][] grid) {
      int count=0;
      int[][] vis=new int[grid.length][grid[0].length];
      for(int i=0;i<grid.length;i++){
        for(int j=0;j<grid[0].length;j++){
            if(grid[i][j]=='1' && vis[i][j]==0){
                vis[i][j]=1;
                dfs(i,j,vis,grid);
                count++;
            }
        }
      }
      return count;  
    }
}

// class Solution {
//      public static class Pair{
//         int row;
//         int col;
//         Pair(int r, int c){
//             this.row = r;
//             this.col = c;
//         }
//     }
//     static Queue<Pair> q = new LinkedList<>();
//     public int numIslands(char[][] grid) {
//         int n = grid.length;
//         int m = grid[0].length;

//         int[][] vis = new int[n][m];
//         int cnt = 0;
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < m; j++) {
//                 if (grid[i][j] == '1' && vis[i][j] == 0) {
//                     q.add(new Pair(i, j));
//                     vis[i][j] = 1;
//                     dfs(i, j, grid, vis);
//                     cnt++;
//                 }
//             }
//         }
//         return cnt;
//     }
//     public static void dfs ( int i, int j, char[][] grid, int[][] vis){
//         int n = grid.length;
//         int m = grid[0].length;
//         int[] drow = {-1, 0, +1, 0};
//         int[] dcol = {0, 1, 0, -1};
//         while (!q.isEmpty()) {
//             int r = q.peek().row;
//             int c = q.peek().col;
//             q.remove();
//             for (int a = 0; a < 4; a++) {
//                 int nrow = r + drow[a];
//                 int ncol = c + dcol[a];
//                 if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
//                     q.add(new Pair(nrow, ncol));
//                     vis[nrow][ncol] = 1;
//                 }
//             }
//         }
//     }

// }