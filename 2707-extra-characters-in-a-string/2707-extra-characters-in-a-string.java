class Solution {
    public int minExtraChar(String s, String[] dictionary) {
       HashSet<String> dictSet = new HashSet<>();
        for (String word : dictionary) {
            dictSet.add(word);
        }

        ArrayList<Character> arr = new ArrayList<>();
        for (char c : s.toCharArray()) {
            arr.add(c);
        }

        for (String word : dictSet) {
            for (char ch : word.toCharArray()) {
                for (int k = 0; k < arr.size(); k++) {
                    if (ch == arr.get(k)) {
                        arr.remove(k);
                        k--; // Adjust index after removal
                        break; // Exit inner loop after removing
                    }
                }
            }
        }

        return arr.size();
    }
}