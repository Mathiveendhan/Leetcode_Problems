class Solution {
    public boolean canChange(String start, String target) {
        if (start.replace("_", "").equals(target.replace("_", ""))) {
            int n = start.length();
            for (int i = 0, j = 0; i < n; i++) {
                if (start.charAt(i) == '_') continue;
                while (j < n && target.charAt(j) == '_') {
                    j++;
                }
                if (start.charAt(i) != target.charAt(j)) {
                    return false;
                }
                if (start.charAt(i) == 'L' && i < j) {
                    return false; 
                }
                if (start.charAt(i) == 'R' && i > j) {
                    return false;
                }
                j++;
            }
            return true;
        }
        return false;
    }
}
