class Solution {
    public int[] separateDigits(int[] nums) {
        ArrayList<Integer> arr=new ArrayList<>();
       StringBuilder sb=new StringBuilder("");
       for(int i:nums){
        sb.append(i);
       }
       String str=sb.toString();
       for(char c:str.toCharArray()){
        arr.add(c-'0');
       }
        int[] ans=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;

    }
}