class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb=new StringBuilder("");
        for(int it:num){
            sb.append(it);
        }
        long n=Long.parseLong(sb.toString());
        Long sum=n+k;
        String ans=Long.toString(sum);
        List<Integer> arr=new ArrayList<>();
        for(int i=0;i<ans.length();i++){
            arr.add(ans.charAt(i)-'0');
        }
        return arr;
    }
}