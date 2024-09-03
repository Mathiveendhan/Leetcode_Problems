class Solution {
    public static int call(int n){
        int sum=0;
        while(n>0){
            int q=n%10;
            n=n/10;
            sum+=q;
        }
        return sum;
    }
    public int addDigits(int num) {
        int n=num;
        while(n>=10){
            n=call(n);
        }
        return n;
    }
}