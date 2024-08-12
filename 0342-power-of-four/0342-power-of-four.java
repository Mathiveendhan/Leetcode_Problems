class Solution {
    public boolean isPowerOfFour(int n) {
        if(n==2147483647){
            return false;
        }
        for(int i=0;i<32;i++){
            int num=(int)Math.pow(4,i);
            if(num==n){
                return true;
            }
        }
        return false;
    }
}