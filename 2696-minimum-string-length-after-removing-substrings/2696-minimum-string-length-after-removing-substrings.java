import java.util.Stack;

class Solution {
    public int minLength(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == 'B' && !st.isEmpty() && st.peek() == 'A') {
                st.pop(); 
            } else if (c == 'D' && !st.isEmpty() && st.peek() == 'C') {
                st.pop();
            } else {
                st.push(c); 
            }
        }
        return st.size(); 
    }
}
