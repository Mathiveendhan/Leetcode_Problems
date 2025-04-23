class Solution {
    public static int get(String s) {
        int sum = 0;
        for (char c : s.toCharArray()) {
            sum += (c - '0');
        }
        return sum;
    }

    public int countLargestGroup(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            int num = get(i + ""); 
            map.put(num, map.getOrDefault(num, 0) + 1); 
        }

        int maxSize = 0;
        for (int value : map.values()) {
            maxSize = Math.max(maxSize, value); 
        }

        int count = 0;
        for (int value : map.values()) {
            if (value == maxSize) {
                count++; 
            }
        }

        return count;
    }
}
