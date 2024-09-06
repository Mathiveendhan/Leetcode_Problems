class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if(s1.equals(s2))
        return true;
        ArrayList<Character> ts=new ArrayList<>();
        ArrayList<Character> ts1=new ArrayList<>();
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
            ts.add(s1.charAt(i));
            ts1.add(s2.charAt(i));    
        }
        }
        for(Character co:ts){
            if(!(ts1.contains(co)))
            return false;
        }
        return (ts.size()==2 && ts1.size()==2)?true:false;
    }
}