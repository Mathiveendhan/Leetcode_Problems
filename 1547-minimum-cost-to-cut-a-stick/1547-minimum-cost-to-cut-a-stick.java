import java.util.*;

class Solution {

    static int[][] dp;

    public static int recursion(int i, int j, int[] arr) {
        if (j - i <= 1) return 0;

        if (dp[i][j] != -1) return dp[i][j];

        int min = Integer.MAX_VALUE;

        for (int idx = i + 1; idx < j; idx++) {
            int cost = (arr[j] - arr[i])
                    + recursion(i, idx, arr)
                    + recursion(idx, j, arr);

            min = Math.min(min, cost);
        }

        return dp[i][j] = min;
    }

    public int minCost(int n, int[] cuts) {
        int c = cuts.length;
        int[] arr = new int[c + 2];

        arr[0] = 0;
        arr[c + 1] = n;

        for (int i = 0; i < c; i++) {
            arr[i + 1] = cuts[i];
        }

        Arrays.sort(arr);

        dp = new int[c + 2][c + 2];
        for (int[] row : dp) Arrays.fill(row, -1);

        return recursion(0, c + 1, arr);
    }
}