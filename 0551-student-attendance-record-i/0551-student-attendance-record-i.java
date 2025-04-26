class Solution {
    public boolean checkRecord(String s) {
        int a=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                a++;
            }
            if(a==2){
                return false;
            }
        }
        for(int j=0;j<s.length()-2;j++){
            String str=s.substring(j,j+3);
            if(str.equals("LLL")){
                return false;
            }
        }
        return true;
    }
}