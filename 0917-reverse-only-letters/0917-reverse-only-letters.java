class Solution {
    public String reverseOnlyLetters(String s) {
        Stack<Character> st=new Stack<>();
        for(int q=0;q<s.length();q++){
            char c=s.charAt(q);
            if((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')){
                st.push(c);
            }
        }
            StringBuilder sb=new StringBuilder("");
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                if((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')){
                    sb.append(st.pop());
                }else{
                    sb.append(ch);
                }
            }
            return sb.toString();
    }
}