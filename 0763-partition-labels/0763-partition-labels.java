class Solution {
    public static int call(HashMap<Character, Integer> map, ArrayList<String> arr, int j, int q, String s, int max) {
        max = j;
        for (int i = q; i <= max; i++) {
            if (max < map.get(s.charAt(i))) {
                max = map.get(s.charAt(i));
            }
        }
        arr.add(s.substring(q, max + 1));
        return max;
    }

    public List<Integer> partitionLabels(String s) {
        ArrayList<String> arr = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            map.put(c, i);
        }
        int q = 0;
        int max = 0;
        while (q < s.length()) {
            int j = map.get(s.charAt(q));
            max = call(map, arr, j, q, s, max);
            q = max + 1;
        }
        List<Integer> ans = new ArrayList<>();
        for (String str : arr) {
            ans.add(str.length());
        }
        return ans;
    }
}