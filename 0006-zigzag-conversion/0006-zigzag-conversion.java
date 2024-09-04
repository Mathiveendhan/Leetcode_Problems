class Solution {
    public static char[][] call(String s, char[][] matrix, int r, int c) {
        int count = 0;
        int j = 0;
        for (int i = 0; i < r; i++) {
            if (count >= s.length()) {
                break;
            }
            char ch = s.charAt(count);
            matrix[i][j] = ch;
            if (i == r - 1) {
                while (i >= 0 && j < c - 1 && count < s.length()) {
                    i--;
                    j++;
                    count++;
                    if (count < s.length()) {
                        char chr = s.charAt(count);
                        if (i >= 0 && j < c) {
                            matrix[i][j] = chr;
                        }
                    }
                }
                i = 0;
                j--;
                count--;
            }
            count++;
        }
        return matrix;
    }
    public String convert(String s, int numRows) {
     if (numRows == 1) return s;
        char[][] matrix = new char[numRows][s.length()];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                matrix[i][j] = '0';
            }
        }
        char[][] ans = call(s, matrix, numRows, s.length());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < s.length(); j++) {
                if (ans[i][j] != '0') {
                    sb.append(ans[i][j]);
                }
            }
        }
        return sb.toString();
    }
}