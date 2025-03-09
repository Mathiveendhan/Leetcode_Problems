class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    arr.add(arr1[j]);
                }
            }
        }
        ArrayList<Integer> num = new ArrayList<>();
        for (int j = 0; j < arr1.length; j++) {
            if (!arr.contains(arr1[j])) {
                num.add(arr1[j]);
            }
        }
        Collections.sort(num);
        for (int q : num) {
            arr.add(q);
        }
        int[] ans = new int[arr.size()];
        for (int b = 0; b < arr.size(); b++) {
            ans[b] = arr.get(b);
        }
        return ans;
    }
}
