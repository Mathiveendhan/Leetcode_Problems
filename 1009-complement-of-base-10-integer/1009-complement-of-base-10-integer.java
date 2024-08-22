import java.math.BigInteger;
class Solution {
    public int bitwiseComplement(int n) {
        String s=Integer.toBinaryString(n);
        String str=s;
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                sb.append("1");
            }else{
                sb.append("0");
            }
        }
        String q=sb.toString();
        int j=Integer.parseInt(q,2);
        return j;
    }
}
