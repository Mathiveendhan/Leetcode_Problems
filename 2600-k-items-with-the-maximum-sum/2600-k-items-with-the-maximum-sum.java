class Solution {
    public static void call(ArrayList<Integer> arr, int i, int n, int element) {
        if (i == n) {
            return;
        }
        arr.add(element);
        call(arr, i + 1, n, element);
    }
    
    public int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        call(arr, 0, numOnes, 1);
        call(arr, 0, numZeros, 0);
        call(arr, 0, numNegOnes, -1);
        
        int sum = 0;
        int j = 0;
        for (j = 0; j < k && j < arr.size(); j++) {
            sum += arr.get(j);
        }
        return sum;
    }
}