import java.util.ArrayList;

class Solution {
    public String getHint(String secret, String guess) {
        int a = 0;  // Count for exact matches (A)
        int b = 0;  // Count for non-exact matches (B)
        
        // Arrays to track the unmatched characters from secret and guess
        ArrayList<Character> secretUnmatched = new ArrayList<>();
        ArrayList<Character> guessUnmatched = new ArrayList<>();
        
        // First pass: count the exact matches (A)
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                a++;  // Increase exact match count
            } else {
                // If not an exact match, store the unmatched characters
                secretUnmatched.add(secret.charAt(i));
                guessUnmatched.add(guess.charAt(i));
            }
        }

        // Second pass: count the non-exact matches (B)
        for (int i = 0; i < guessUnmatched.size(); i++) {
            char c = guessUnmatched.get(i);
            if (secretUnmatched.contains(c)) {
                b++;  // Found a non-exact match
                secretUnmatched.remove((Character) c);  // Remove the matched character to avoid double counting
            }
        }

        // Build the result string with A's and B's
        String ans = a + "A" + b + "B";
        
        return ans;
    }
}
