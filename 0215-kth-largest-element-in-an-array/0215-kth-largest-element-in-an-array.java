class Solution {
    public int findKthLargest(int[] nums, int k) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int it:nums){
            arr.add(it);
        }
        Collections.sort(arr);
        Collections.reverse(arr);
        return arr.get(k-1);
    }
}