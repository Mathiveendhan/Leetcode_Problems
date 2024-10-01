class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String f=strs[0];
        String l=strs[strs.length-1];
        int i=0;
        while(i<f.length() && i<l.length()){
            if(f.charAt(i)==l.charAt(i)){
                i++;
            }else{
                break;
            }
        }
        return f.substring(0,i);
    }
}