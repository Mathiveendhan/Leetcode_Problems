class Solution {
    public static int check(int n){
        int num=0;
        while(n!=0){
            int r=n%10;
            n=n/10;
            num+=(r*r);
        }
        return num;
    }
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        while(n!=1 && !set.contains(n)){
            set.add(n);
            n=check(n);
        }
        return n==1;
    }
}