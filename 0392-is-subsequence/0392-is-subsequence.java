class Solution {
    public boolean isSubsequence(String s, String t) {
       int count=0;
       int pos=0;
       for(int i=0;i<s.length();i++){
        char ch=s.charAt(i);
        for(int j=pos;j<t.length();j++){
            if(ch==t.charAt(j)){
                count++;
                pos=j+1;
                break;
            }
        
        }
       }
       System.out.print(count);
       if(count!=s.length()){
        return false;
       }
       return true;
        
    }
}