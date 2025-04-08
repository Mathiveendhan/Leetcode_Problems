class Solution {
    public int minimumOperations(int[] nums) {
       List<Integer> arr = new ArrayList<>();
       for (int num : nums) {
           arr.add(num);
       }
       int count = 0;
       while (true) {
            Set<Integer> set = new HashSet<>(arr);
            if (set.size() == arr.size()) {
                break;
            }
            int remCount = Math.min(3, arr.size());
            for (int i = 0; i < remCount; i++) {
                arr.remove(0);
            }
            count++;
       }
       return count;
    }
}
