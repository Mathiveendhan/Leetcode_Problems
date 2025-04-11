class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int ans = 0;
        for (int i = low; i <= high; i++) {
            String str = i + "";
            if (str.length() % 2 != 0) {
                continue;
            } else {
                int n = str.length() / 2;
                String f = str.substring(0, n);
                String s = str.substring(n);
                int left = 0, right = 0;
                for (int k = 0; k < f.length(); k++) {
                    left += (f.charAt(k) - '0');
                }

                for (int j = 0; j < s.length(); j++) {
                    right += (s.charAt(j) - '0');
                }
                if (left == right) {
                    ans++;
                }

            }
        }
        return ans;
    }
}