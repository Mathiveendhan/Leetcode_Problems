class Solution {
      public boolean call(String str) {
        Stack<Character> stack=new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) != stack.pop()) {
                return false; 
            }
        }
        
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(String st:words){
            boolean an=call(st);
            if(an==true){
                return st;
            }
        }
    return "";
    }
}