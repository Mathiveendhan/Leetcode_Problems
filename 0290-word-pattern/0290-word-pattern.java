class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashSet<Character> hash=new HashSet<>();
        for(char c:pattern.toCharArray()){
            hash.add(c);
        }

        HashSet<String> hash1=new HashSet<>();
        String[] str=s.split(" ");
        for(String st:str){
            hash1.add(st);
        }

        return hash.size()==hash1.size();
    }
}