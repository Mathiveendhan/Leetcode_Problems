class Solution {
     public static int Acall(int n){
        int count=0;
        while(n>0){
            int r=n%10;
            if(r==0){
                count++;
            }else{
                break;
            }
            n=n/10;
        }
        return count;
    }

    public static int trailingZeroes(int n){
        int fac=1;
        if(n==0){
            return 0;
        }
        for(int i=1;i<=n;i++){
            fac=fac*i;
        }
        return Acall(fac);
    }

}
