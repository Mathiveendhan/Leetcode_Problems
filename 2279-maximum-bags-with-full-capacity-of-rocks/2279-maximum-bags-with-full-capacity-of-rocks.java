class Solution {
    public int maximumBags(int[] c, int[] r, int aR) {
        int n = c.length;
        int arr[][] = new int[n][2];

        for(int i=0; i<n; i++){
            arr[i] = new int[]{c[i],r[i]};
        }

        Arrays.sort(arr,(a,b)->(a[0]-a[1])-(b[0]-b[1]));
        int ans = 0;

        for(int i=0; i<n; i++){
            if(arr[i][1]==arr[i][0]) ans++;
            else{
                int diff = arr[i][0]-arr[i][1];
                if(diff<=aR){
                    ans++;
                    aR = aR-diff;
                }
            }
        }
        return ans;
    }
}