class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeat = 0;
        int missing = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                arr.add(grid[a][b]);
            }
        }

        Collections.sort(arr);

        for (int i : arr) {
            if (!set.contains(i)) {
                set.add(i);
            } else {
                repeat = i;
            }
        }

        int n = grid.length * grid[0].length;  
        for (int z = 1; z <= n; z++) {
            if (!set.contains(z)) {
                missing = z;
                break;
            }
        }

        return new int[]{repeat, missing};
    }
}
