class Solution {
    public String reverseWords(String s) {
       String[] str=s.split(" ");
       StringBuilder sb=new StringBuilder("");
        for(int j=0;j<str.length;j++){
            String st=str[j];
            for(int i=st.length()-1;i>=0;i--){
                sb.append(st.charAt(i));
            }
            if(j!=str.length-1){
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}