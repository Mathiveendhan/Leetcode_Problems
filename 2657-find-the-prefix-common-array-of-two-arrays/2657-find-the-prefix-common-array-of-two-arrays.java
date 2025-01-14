class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
       int[] ans=new int[A.length];
       ArrayList<Integer> arr1=new ArrayList<>();
       ArrayList<Integer> arr2=new ArrayList<>();
       for(int i=0;i<A.length;i++){
        arr1.add(A[i]);
        arr2.add(B[i]);
        int count=0;
        for(int j=0;j<=i;j++){
            if(arr2.contains(arr1.get(j))){
                count++;
            }
        }
        ans[i]=count;
       }
       return ans;
    }
}