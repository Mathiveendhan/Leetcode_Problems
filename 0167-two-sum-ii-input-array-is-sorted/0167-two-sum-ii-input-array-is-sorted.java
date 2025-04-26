class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] ans=new int[2];
        int l=0,r=numbers.length-1;
        while(l<=r){
            int num=numbers[l]+numbers[r];
            if(num==target){
                return new int[]{l+1,r+1};
            }else if(num>target){
                r--;
            }else{
                l++;
            }
        }
        return new int[]{-1,-1};
    }
}