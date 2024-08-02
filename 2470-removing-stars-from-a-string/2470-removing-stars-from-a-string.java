import java.util.*;

class Solution {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '*') {
                stack.push(s.charAt(i));
            } else if (s.charAt(i) == '*') {
                stack.pop();
            }
        }
        Stack<Character> st = new Stack<>();
        while (!stack.isEmpty()) {
            st.push(stack.pop());
        }
        if (st.isEmpty()) {
            return "";
        }
        StringBuilder str=new StringBuilder();
        str.append(st.pop());
        while (!st.isEmpty()) {
            str.append(st.pop());
        }
        return str.toString();
    }
}
