class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==2147483647){
            return false;
        }
        for(int i=0;i<32;i++){
            int num=(int)Math.pow(3,i);
            if(num==n){
                return true;
            }
        }
        return false;
    }
}