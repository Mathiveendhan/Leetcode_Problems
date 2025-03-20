class Solution {
    public static int call(int n){
        if(n==0) return 1;
        else return 0;
    }
    public int minOperations(int[] nums) {
      int[] temp=nums.clone();
      int count=0;
      for(int i=0;i<nums.length-2;i++){
        if(temp[i]==0){
            count++;
            int b=i;
            int a=0;
            while(a<3){
                temp[i]=call(temp[i]);
                i++;
                a++;
            }
            i=b;
        }
      }
      for(int j:temp){
        if(j==0){
            return -1;
        }
      }
      return count;
    //   return count>0?count:-1;  
    }
}