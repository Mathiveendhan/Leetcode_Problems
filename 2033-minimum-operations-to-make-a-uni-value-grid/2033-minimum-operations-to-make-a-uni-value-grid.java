class Solution {
     public static int check(ArrayList<Integer> arr, int sub, int target) {
        int totalOps = 0;
        for (int i : arr) {
            int diff = Math.abs(i - target);
            if (diff % sub != 0) { 
                return -1;
            }
            totalOps += diff / sub; 
        }
        return totalOps;
    }

    public static int minOperations(int[][] grid, int x) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int a = 0; a < grid.length; a++) {
            for (int b = 0; b < grid[0].length; b++) {
                arr.add(grid[a][b]);
            }
        }

        Collections.sort(arr);
        int n = arr.size();
        int target = arr.get(n / 2);  
        return check(arr, x, target);
    }
}