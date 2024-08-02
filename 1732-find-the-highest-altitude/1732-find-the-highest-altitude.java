class Solution {
    public int largestAltitude(int[] gain) {
        int[] ans = new int[gain.length + 1];
        Stack<Integer> st = new Stack<>();
        st.push(0);
        for (int i = 0; i < gain.length; i++) {
            st.push(st.peek() + gain[i]); 
        }
        int max = 0;
        while (!st.isEmpty()) {
            int num = st.pop();
            if (num > max) { 
                max = num;
            }
        }
        
        return max;
    }
}
