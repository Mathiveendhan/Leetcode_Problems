class Solution {
    public int minAddToMakeValid(String s) {
      int open=0;
      int close=0;
      for(char ch:s.toCharArray()){
        if(ch=='('){
            close++;
        }else{
            open++;
        }
      }
      return Math.abs(open-close);
    }
}