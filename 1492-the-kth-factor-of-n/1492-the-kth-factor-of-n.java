class Solution {
    public int kthFactor(int n, int k) {
     ArrayList<Integer> arr=new ArrayList<>();
     int a=1;
     while(a<=n){
        if(n%a==0){
            arr.add(a);
        }
        a++;
     }

     if(k<=arr.size()){
        return arr.get(k-1);
     }else{
        return -1;
     }
    }
}