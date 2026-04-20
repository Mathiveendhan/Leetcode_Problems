import java.util.*;

class Solution {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> result = new ArrayList<>();
        int[][] board = new int[n][n];
        solve(0, n, board, result);
        return result;
    }

    private void solve(int col, int n, int[][] board, List<List<String>> result) {
        if (col == n) {
            result.add(construct(board, n));
            return;
        }

        for (int row = 0; row < n; row++) {
            if (isSafe(row, col, board, n)) {
                board[row][col] = 1;
                solve(col + 1, n, board, result);
                board[row][col] = 0;
            }
        }
    }

    private boolean isSafe(int r, int c, int[][] board, int n) {

        for (int col = 0; col < c; col++) {
            if (board[r][col] == 1) return false;
        }

        for (int i = r, j = c; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) return false;
        }

        for (int i = r, j = c; i < n && j >= 0; i++, j--) {
            if (board[i][j] == 1) return false;
        }

        return true;
    }

    private List<String> construct(int[][] board, int n) {
        List<String> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 1) row.append("Q");
                else row.append(".");
            }
            res.add(row.toString());
        }

        return res;
    }
}