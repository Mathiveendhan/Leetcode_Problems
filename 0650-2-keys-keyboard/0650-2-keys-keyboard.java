class Solution {
    public int minSteps(int n) {
        int num=n;
        int ans=0;
        for(int i=2;i<=n;i++){
            if(num==1){
                break;
            }
            if(num%i==0){
                ans+=i;
                num=num/i;
                i--;
            }
        }
        return ans;
    }
}