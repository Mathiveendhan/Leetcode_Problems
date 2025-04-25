class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> hash = new HashMap<>();
        for (int i = 0; i < magazine.length(); i++) {
            char ch = magazine.charAt(i);
            if (!hash.containsKey(ch)) {
                hash.put(ch, 1);
            } else {
                hash.put(ch, hash.get(ch) + 1);
            }
        }
        for (int j = 0; j < ransomNote.length(); j++) {
            char chr = ransomNote.charAt(j);
            if (hash.containsKey(chr) && hash.get(chr)>0) {
                hash.put(chr, hash.get(chr) - 1);
            } else {
                return false;
            }
        }
        return true;
    }
}