class Solution {
    public static int call(String str, int k) {
        int n = 0;
        for (int i = 0; i < k; i++) {
            int sum = 0;
            for (int j = 0; j < str.length(); j++) {
                sum += Character.getNumericValue(str.charAt(j));
            }
            str = Integer.toString(sum); 
        }
        return Integer.parseInt(str); 
    }

    public int getLucky(String s, int k) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int value = ch - 'a' + 1; 
            sb.append(value);
        }
        String str = sb.toString();
        int ans = call(str, k);
        return ans;
    }
}
