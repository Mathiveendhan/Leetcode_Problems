class Solution {
    public boolean hasMatch(String s, String p) {
        String s1="ji";
        String s2="hu";
        for(int q=0;q<p.length();q++){
            if(p.charAt(q)=='*'){
                s1=p.substring(0,q);
                s2=p.substring(q+1);
                break;
            }
        }
        int first=s.indexOf(s1);
        int last=s.lastIndexOf(s2);
        if(first<0 || last<0){
            return false;
        }
        return first+s1.length()<=last;
       
    }
}