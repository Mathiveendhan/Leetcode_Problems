class Solution {
    static boolean call(int i, String s,
            List<String> wordDict, int[] dp) {
        if (i == s.length()) {
            return true;
        }
        if (dp[i] != -1) {
            return dp[i] == 1;
        }
        for (int j = i + 1; j <= s.length(); j++) {
            String str = s.substring(i, j);
            if (wordDict.contains(str)) {
                if (call(j, s, wordDict, dp)) {
                    dp[i] = 1;
                    return true;
                }
            }
        }
        dp[i] = 0;
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        int[] dp = new int[s.length() + 1];
        Arrays.fill(dp, -1);
        return call(0, s, wordDict, dp);
    }
}