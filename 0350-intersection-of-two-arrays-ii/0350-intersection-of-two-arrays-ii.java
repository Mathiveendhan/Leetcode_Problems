class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        for(int x:nums1){
            l1.add(x);
        }

        for(int x:nums2){
            if(l1.contains(x)){
                l2.add(x);
                l1.remove(Integer.valueOf(x));
            }
        }

        int [] ans=new int[l2.size()];
        int i=0;
        for(int x:l2){
            ans[i++]=x;
        }

        return ans;
    }
}