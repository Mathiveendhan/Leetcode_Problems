class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> num=new ArrayList<>();
        for(int w:arr){
            num.add(w);
        }
        int a=k;
        for(int i=1;i<10000;i++){
            if(!num.contains(i)){
                a--;
                if(a==0){
                    return i;
                }
            }
          
        }
          return 0;
    }
}