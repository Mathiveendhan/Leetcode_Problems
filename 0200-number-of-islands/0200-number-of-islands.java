class Solution {
     public static class Pair{
        int row;
        int col;
        Pair(int r, int c){
            this.row = r;
            this.col = c;
        }
    }
      static Queue<Pair> q = new LinkedList<>();
    public int numIslands(char[][] grid) {
        int n = grid.length;
        int m = grid[0].length;

        int[][] vis = new int[n][m];
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1' && vis[i][j] == 0) {
                    q.add(new Pair(i, j));
                    vis[i][j] = 1;
                    dfs(i, j, grid, vis);
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void dfs ( int i, int j, char[][] grid, int[][] vis){
        int n = grid.length;
        int m = grid[0].length;
        int[] drow = {-1, 0, +1, 0};
        int[] dcol = {0, 1, 0, -1};
        while (!q.isEmpty()) {
            int r = q.peek().row;
            int c = q.peek().col;
            q.remove();
            for (int a = 0; a < 4; a++) {
                int nrow = r + drow[a];
                int ncol = c + dcol[a];
                if (nrow >= 0 && nrow < n && ncol >= 0 && ncol < m && vis[nrow][ncol] == 0 && grid[nrow][ncol] == '1') {
                    q.add(new Pair(nrow, ncol));
                    vis[nrow][ncol] = 1;
                }
            }
        }
    }

}