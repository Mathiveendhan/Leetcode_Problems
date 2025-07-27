class Solution {
    public int maxSum(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int a : nums) {
            if (a > max) {
                max = a;
            }
        }
        HashSet<Integer> set = new HashSet<>();
        int sum = 0;
        for (int i : nums) {
            if (i >= 0 && set.add(i)) { 
                sum += i;
            }
        }
        return sum > 0 ? sum : max; 
    }
}
