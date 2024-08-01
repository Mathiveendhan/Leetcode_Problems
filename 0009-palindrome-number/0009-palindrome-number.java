import java.util.*;

class Solution {
    static Stack<Character> stack = new Stack<>();

    public boolean isPalindrome(int x) {
        String str = String.valueOf(x);
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != stack.pop()) {
                return false; 
            }
        }
        
        return true;
    }
}
