class Solution {
    public int findFinalValue(int[] nums, int original) {
       boolean found=false;
       int org=original;
       for(int j:nums){
        if(j==org){
            found=true;
        }
       }
       while(found){
        if(found){
            org*=2;
            for(int i:nums){
                if(i==org){
                    found=true;
                    break;
                }else{
                    found=false;
                }
            }
        }
       }
        return org; 
    }
}