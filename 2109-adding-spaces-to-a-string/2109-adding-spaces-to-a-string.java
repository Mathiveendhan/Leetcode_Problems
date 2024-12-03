class Solution {
    public String addSpaces(String s, int[] spaces) {
        Arrays.sort(spaces);
        int n=0;
        StringBuilder sb=new StringBuilder("");
        for(int i:spaces){
            for(int j=n;j<=i;j++){
                if(j==i){
                    sb.append(" ");
                    n=i;
                    break;
                }else{
                    sb.append(s.charAt(j));
                }
            }
        }

        for(int k=n;k<s.length();k++){
            sb.append(s.charAt(k));
        }
        return sb.toString();
    }
}