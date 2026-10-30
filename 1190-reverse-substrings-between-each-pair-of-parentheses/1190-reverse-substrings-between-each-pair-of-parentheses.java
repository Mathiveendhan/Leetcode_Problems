class Solution {
    static void reverse(char[] ch,int l,int r){
        while(l<r){
            char c=ch[l];
            ch[l]=ch[r];
            ch[r]=c;
            l++;
            r--;
        }
    }
    public String reverseParentheses(String s) {
        char[] ch=s.toCharArray();
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                st.push(i);
            }else if(ch[i]==')'){
                reverse(ch,st.pop(),i);
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(char c:ch){
            if(c!='(' && c!=')'){
                sb.append(c);
            }
        }
        return sb.toString();
    }
}