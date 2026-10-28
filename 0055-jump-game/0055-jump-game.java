class Solution {
    static HashMap<Integer, Boolean> map = new HashMap<>();

    static boolean call(int[] nums, int idx) {
        if (idx == nums.length - 1) {
            return true;
        }

        if (idx >= nums.length) {
            return false;
        }

        if (map.containsKey(idx)) {
            return map.get(idx);
        }

        for (int i = 1; i <= nums[idx]; i++) {
            if (call(nums, idx + i)) {
                map.put(idx, true);
                return true;
            }
        }

        map.put(idx, false);
        return false;
    }

    public boolean canJump(int[] nums) {
        map.clear();
        return call(nums, 0);
    }
}