class Solution {
    public static int min(HashMap<Character,Integer> map){
        int min=Integer.MAX_VALUE;
        char[] arr={'a','b','c'};
        for(char c:arr){
            min=Math.min(min,map.get(c));
        }
        return min+1;
    }
    public int numberOfSubstrings(String str) {
        HashMap<Character,Integer> map=new HashMap<>();
        int i=0,ans=0;
        while(i<str.length()){
            char ch=str.charAt(i);
            map.put(ch,i);
            if(map.size()==3){
                ans+=min(map);
            }
            i++;
        }
        return ans;
    }
}