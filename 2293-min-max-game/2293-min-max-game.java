class Solution {
    public static int call(ArrayList<Integer> arr) {
        // Base case: If there's only one element left, return it
        if (arr.size() == 1) {
            return arr.get(0);
        }
        
        // Create a new list to store the results of the next level
        ArrayList<Integer> list = new ArrayList<>();
        
        // Loop through the current list and compute min/max values based on the index
        for (int i = 0; i < arr.size() / 2; i++) {
            // Even indices: take the min of arr[2 * i] and arr[2 * i + 1]
            if (i % 2 == 0) {
                list.add(Math.min(arr.get(2 * i), arr.get(2 * i + 1)));
            } else {  // Odd indices: take the max of arr[2 * i] and arr[2 * i + 1]
                list.add(Math.max(arr.get(2 * i), arr.get(2 * i + 1)));
            }
        }
        
        // Recursively call for the next level of the game
        return call(list);
    }

    public int minMaxGame(int[] nums) {
        // Convert the input array to an ArrayList for processing
        ArrayList<Integer> arr = new ArrayList<>();
        for (int e : nums) {
            arr.add(e);
        }
        
        // Call the recursive method and return the result
        return call(arr);
    }
}
