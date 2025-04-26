class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if((c>='a' && c<='z') || (c>='A' && c<='Z') || (c>='0' && c<='9')){
                sb.append(Character.toLowerCase(c));
            }
        }
        String str=sb.toString();
        int l=0,r=str.length()-1;
        while(l<=r){
            if(str.charAt(l)!=str.charAt(r)){
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}