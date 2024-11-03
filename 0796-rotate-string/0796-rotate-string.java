class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false; 
        }
        char[] charArray = s.toCharArray();
        int n = s.length();
        
        for (int j = 0; j < n; j++) {
            char first = charArray[0];
            for (int i = 1; i < n; i++) {
                charArray[i - 1] = charArray[i];
            }
            charArray[n - 1] = first;
            String rotatedString = new String(charArray);
            if (rotatedString.equals(goal)) {
                return true;
            }
        }
        
        return false;
    }
}
