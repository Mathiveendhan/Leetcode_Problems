class Solution {
    public int countServers(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        int ans = 0;
        
        // Row and column count of active servers
        int[] rowCount = new int[row];
        int[] colCount = new int[column];

        // Calculate row and column counts
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1) {
                    rowCount[i]++;
                    colCount[j]++;
                }
            }
        }

        // Count servers that can communicate
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == 1 && (rowCount[i] > 1 || colCount[j] > 1)) {
                    ans++;
                }
            }
        }

        return ans;
    }
}
