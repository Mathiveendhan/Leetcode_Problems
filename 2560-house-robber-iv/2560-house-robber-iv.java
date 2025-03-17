class Solution {
    public int minCapability(int[] a, int k) {
        int n = a.length;
        int lo = Integer.MAX_VALUE;

        for (int x : a)
            lo = Math.min(lo, x);
        int hi = 0;
        for (int x : a)
            hi = Math.max(hi, x);

        int ans = 0;
        while (hi >= lo) {
            int mid = (lo + hi) / 2;
            int max = 0;

            for (int i = 0; i < n; i++) {
                if (a[i] <= mid) {
                    i++;
                    max++;
                }
            }

            if (max >= k) {
                hi = mid - 1;
                ans = mid;
            } else
                lo = mid + 1;
        }
        return ans;
    }
}

// class Solution {
// public static void call(int[] nums, ArrayList<Integer> arr, int k, int i,
// ArrayList<Integer> maxi) {
// if (k == 0) {
// maxi.add(Collections.max(arr));
// }
// if (i >= nums.length) {
// return;
// }
// arr.add(nums[i]);
// call(nums, arr, k - 1, i + 2, maxi);
// arr.remove(arr.size() - 1);
// call(nums, arr, k, i + 1, maxi);
// }

// public int minCapability(int[] nums, int k) {
// ArrayList<Integer> maxi = new ArrayList<>();
// ArrayList<Integer> arr = new ArrayList<>();
// call(nums, arr, k, 0, maxi);
// return Collections.min(maxi);
// }
// }

// class Solution {
// public static void call(int[] nums,ArrayList<ArrayList<Integer>>
// fsol,ArrayList<Integer> arr,int k,int i){
// if(k==0){
// fsol.add(new ArrayList<>(arr));
// return;
// }
// if(i>=nums.length){
// return;
// }
// arr.add(nums[i]);
// call(nums,fsol,arr,k-1,i+2);
// arr.remove(arr.size()-1);
// call(nums,fsol,arr,k,i+1);
// }
// public int minCapability(int[] nums, int k) {
// ArrayList<ArrayList<Integer>> fsol=new ArrayList<>();
// ArrayList<Integer> arr=new ArrayList<>();
// call(nums,fsol,arr,k,0);
// ArrayList<Integer> maxi=new ArrayList<>();
// for(ArrayList<Integer> i:fsol){
// maxi.add(Collections.max(i));
// }

// return Collections.min(maxi);

// }
// }