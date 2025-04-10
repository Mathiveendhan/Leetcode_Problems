import java.util.*;

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordSet = new HashSet<>(wordList);
        if (!wordSet.contains(endWord)) return 0;

        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        int level = 1;

        while (!queue.isEmpty()) {
            int size = queue.size();

            // Use a for loop instead of the shorthand while (size-- > 0)
            for (int i = 0; i < size; i++) {
                String word = queue.poll();
                char[] chars = word.toCharArray();

                // Try changing each character of the current word
                for (int j = 0; j < chars.length; j++) {
                    char original = chars[j];
                    // Try replacing the character with 'a' to 'z'
                    for (char c = 'a'; c <= 'z'; c++) {
                        chars[j] = c;
                        String next = new String(chars);

                        // If the next word is the end word, return the level + 1 (because we found the path)
                        if (next.equals(endWord)) {
                            return level + 1;
                        }

                        // If the new word is valid and exists in the word set, add it to the queue
                        if (wordSet.contains(next)) {
                            queue.add(next);
                            wordSet.remove(next);  // Remove to prevent revisiting
                        }
                    }
                    chars[j] = original;  // Restore the original character
                }
            }

            level++;  // Increment the level after processing all words at the current level
        }

        return 0;  // If we exit the while loop, no transformation was found
    }
}
