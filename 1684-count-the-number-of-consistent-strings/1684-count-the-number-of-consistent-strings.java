import java.util.HashSet;

class Solution {
    static int count = 0;

    public static void call(HashSet<Character> letter, char[] str) {
        for (char ch : str) {
            if (!letter.contains(ch)) {
                count++;
                return;
            }
        }
    }

    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> letter = new HashSet<>();
        for (char c : allowed.toCharArray()) {
            letter.add(c);
        }
        
        count = 0; 
        for (String str : words) {
            call(letter, str.toCharArray());
        }

        return (words.length - count);
    }
}
