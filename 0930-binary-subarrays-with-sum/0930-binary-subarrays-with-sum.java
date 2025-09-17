class Solution {
    public int numSubarraysWithSum(int[] arr, int goal) {
        return call(arr,goal)-call(arr,goal-1);
    }
    public static int call(int[] arr,int goal){
        if(goal<0) return 0;
        int l=0,r=0,sum=0,count=0;
        while(r<arr.length){
            sum+=arr[r];
            while(sum>goal){
                sum-=arr[l];
                l++;
            }
            count+=(r-l+1);
            r++;
        }
        return count;
    }
}