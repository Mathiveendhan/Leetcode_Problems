class Solution {
    public int singleNonDuplicate(int[] arr) {
        if(arr.length==0){
            return arr[0];
        }
        int count=0,l=0;
        while(l<arr.length){
            if(l==arr.length-1){
                return arr[l];
            }
            if(arr[l]==arr[l+1]){
                count++;
            }
            if(arr[l]!=arr[l+1]){
                if(count==0){
                return arr[l];
                }
                count=0;
            }
            l++;
        }
        return 0; 
    }
}