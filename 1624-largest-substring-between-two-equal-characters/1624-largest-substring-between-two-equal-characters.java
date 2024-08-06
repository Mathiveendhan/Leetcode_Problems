class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        int max=0;
        int match=0;
     for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(i!=j && s.charAt(i)==s.charAt(j)){
                String str=s.substring(i,j+1);
                match++;
                if(max<str.length()-2){
                    max=str.length()-2;
                }
            }
        }
     }
      if(match==0){
            return -1;
        }
        return max;
    }
}