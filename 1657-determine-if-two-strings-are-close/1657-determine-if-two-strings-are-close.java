import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        
        HashMap<Character, Integer> m1 = new HashMap<>();
        HashMap<Character, Integer> m2 = new HashMap<>();

        // Count frequencies for word1
        for (char c : word1.toCharArray()) {
            m1.put(c, m1.getOrDefault(c, 0) + 1);
        }

        // Count frequencies for word2
        for (char cc : word2.toCharArray()) {
            m2.put(cc, m2.getOrDefault(cc, 0) + 1);
        }

        // Check if both maps have the same keys (unique characters)
        if (!m1.keySet().equals(m2.keySet())) {
            return false;
        }

        // Create arrays to hold frequency counts
        ArrayList<Integer> arr1 = new ArrayList<>(m1.values());
        ArrayList<Integer> arr2 = new ArrayList<>(m2.values());

        // Sort frequency arrays
        Collections.sort(arr1);
        Collections.sort(arr2);

        // Compare sorted frequency counts
        return arr1.equals(arr2);
    }
}
