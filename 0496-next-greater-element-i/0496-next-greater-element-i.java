class Solution {
    public static int call(int target,int[] arr){
        for(int j=0;j<arr.length;j++){
            if(target==arr[j]){
                for(int k=j;k<arr.length;k++){
                    if(target<arr[k]){
                        return arr[k];
                    }
                }
                return -1;
            }
        }
        return -1;
    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            ans[i]=call(nums1[i],nums2);
        }
        return ans;
    }
}