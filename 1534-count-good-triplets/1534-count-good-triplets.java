class Solution {
    public int countGoodTriplets(int[] arr, int m, int n, int o) {
        int count=0;
        int len=arr.length;
        for(int a=0;a<len;a++){
            int x=arr[a];
            for(int b=a+1;b<len;b++){
                int y=arr[b];
                for(int c=b+1;c<len;c++){
                    int z=arr[c];
                    if(Math.abs(x-y)<=m && Math.abs(y-z)<=n && Math.abs(z-x)<=o){
                       count++;
                    }

                }
            }
        }
        return count;
    }
}