class Solution {
    public boolean isPowerOfThree(int n) {

        for(int i=0;i<32;i++){
            int num=(int)Math.pow(3,i);
            if(num==n){
                return true;
            }
        }
        return false;
    }
}