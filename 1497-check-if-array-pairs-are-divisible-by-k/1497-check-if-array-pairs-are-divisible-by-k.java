class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] remainderCount = new int[k];
                for (int num : arr) {
            int remainder = num % k;
            if (remainder < 0) {
                remainder += k; 
                }
            remainderCount[remainder]++;
        }
                for (int i = 1; i <= k / 2; i++) {
            if (remainderCount[i] != remainderCount[k - i]) {
                return false;
            }
        }
        if (remainderCount[0] % 2 != 0) {
            return false;
        }
        return true;
    }
}
