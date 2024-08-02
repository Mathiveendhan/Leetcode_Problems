class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
      HashSet<Integer> hash=new HashSet<>();
      for(int i=0;i<nums1.length;i++){
        for(int j=0;j<nums2.length;j++){
            if(nums1[i]==nums2[j]){
                hash.add(nums1[i]);
                break;
            }
        }
      }
       int[] arr=new int[hash.size()];
        int k=0;
        for(int hh:hash){
            arr[k]=hh;
            k++;
        }
      return arr;
    }
}