class Solution {
    public int maximumWealth(int[][] accounts) {
        int m=0;
        ArrayList<Integer> arr=new ArrayList<>();
        for(int n=0;n<accounts.length;n++){
            int[] num=accounts[n];
            int sum=0;
            for(int i:num){
                sum+=i;
            }
            arr.add(sum);
        }

       return Collections.max(arr);
    }
}