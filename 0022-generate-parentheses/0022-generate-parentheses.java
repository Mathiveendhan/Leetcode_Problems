class Solution {
    public static void call(int n,int openP,int closeP, StringBuilder sb,List<String> ans){
        if(openP>n || closeP>n){
            return;
        }
        if(openP==n && closeP==n){
            ans.add(sb.toString());
            return;
        }
        

        sb.append("(");
        call(n,openP+1,closeP,sb,ans);
        sb.deleteCharAt(sb.length()-1);
        if(closeP<openP){
            sb.append(")");
            call(n,openP,closeP+1,sb,ans);
            sb.deleteCharAt(sb.length()-1);

        }
    }
    public List<String> generateParenthesis(int n) {
       int openP=0,closeP=0;
       List<String> ans=new ArrayList<>();
       StringBuilder sb=new StringBuilder("");
       call(n,openP,closeP,sb,ans);
       return ans; 
    }
}