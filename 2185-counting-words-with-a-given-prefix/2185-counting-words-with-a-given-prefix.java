class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans=0;
        for(int i=0;i<words.length;i++){
            if(pref.length()<=words[i].length()){
                if(words[i].substring(0,pref.length()).equals(pref)){
                    ans++;
                }
            }
        }
        return ans;
    }
}