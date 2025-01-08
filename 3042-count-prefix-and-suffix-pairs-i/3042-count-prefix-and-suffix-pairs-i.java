class Solution {
    public static boolean isPrefixAndSuffix(String s1,String s2){
        if(s1.length()<=s2.length()){
          String str1=s2.substring(0,s1.length());
          String str2=s2.substring(s2.length() - s1.length());
          if(str1.equals(s1) && str2.equals(s1)){
            return true;
          }  
        }
        return false;
    }

    public int countPrefixSuffixPairs(String[] words) {
        int count=0;
        for(int i=0;i<words.length;i++){
            for(int j=i;j<words.length;j++){
                if(i!=j){
                    if(isPrefixAndSuffix(words[i],words[j])){
                        count++;
                    }
                }
            }
        }
        return count;
    }
}