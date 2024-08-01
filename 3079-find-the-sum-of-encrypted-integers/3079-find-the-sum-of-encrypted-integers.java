class Solution {
    public static String maxx(int num){
        String word=Integer.toString(num);
        int max=0;
        for(int i=0;i<word.length();i++){
            if(max<word.charAt(i)-'0'){
                max=word.charAt(i)-'0';
            }
        }
        StringBuilder sb=new StringBuilder("");
        for(int j=0;j<word.length();j++){
            sb.append(max);
        }
        return sb.toString();
    }
    public int sumOfEncryptedInt(int[] nums) {
        int[] arr=new int[nums.length];
        int r=0;
        for(int n:nums){
            arr[r]=Integer.parseInt(maxx(n));
            r++;
        }
        int sum=0;
        for(int ch:arr){
            sum+=ch;
        }
         return sum;
    }
}