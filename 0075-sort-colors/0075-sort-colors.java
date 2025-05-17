
class Solution {
    public void sortColors(int[] nums) {
         int len=nums.length;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(nums[j]>nums[j+1]){
                    int top=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=top;
                }
            }
        }
        for(int a=0;a<nums.length;a++) {
            System.out.print(nums[a]+" ");
        }
        System.out.println(" ");
    }
}