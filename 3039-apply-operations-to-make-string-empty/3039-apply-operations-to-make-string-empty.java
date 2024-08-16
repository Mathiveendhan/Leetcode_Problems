class Solution {
    public String lastNonEmptyString(String s) 
    {
        int freq [] = new int [26];
        int max =-1;
        for(char c : s.toCharArray())
        {
            freq[c-'a']++;
            max = Math.max(freq[c-'a'],max);
        }
        String ans ="";
        Set<String>st = new HashSet();
        for(int i =s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
           
            if(freq[c-'a']==max&&(!st.contains(c+"")))
                ans =c+ans;
             st.add(c+"");
        }
        return ans;
        
    }
}