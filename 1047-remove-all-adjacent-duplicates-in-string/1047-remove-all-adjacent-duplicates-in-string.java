class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack<>();
        stack.push(s.charAt(0));
        for(int i=1;i<s.length();i++){
            if(!stack.isEmpty() && stack.peek()==s.charAt(i)){
                stack.pop();
            }else{
                stack.push(s.charAt(i));
            }
        }
        Stack<Character> st=new Stack<>();
        StringBuilder sb=new StringBuilder("");
        while(!stack.isEmpty()){
            st.push(stack.pop());
        }
        while(!st.isEmpty()){
            sb.append(st.pop());
        }
        return sb.toString();
    }
}