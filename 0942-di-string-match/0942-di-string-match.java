class Solution {
    public int[] diStringMatch(String s) {
        int a[]=new int[s.length()+1];
        int low=0, high=s.length();
        int c=0;
        for(char i: s.toCharArray()){
            if(i=='I'){
                a[c]=low;
                c++;
                low++;
            }
            else{
                a[c]=high;
                c++; high--;
            }
        }
        a[c]=low;
        return a;
    }
}


// class Solution {
//     public int[] diStringMatch(String s) {
//          String ss = "0123456789";
//         String sss = ss.substring(0, s.length() + 1);  
//         char[] str = sss.toCharArray();
//         for (int i = 0; i < s.length(); i++) {
//             for (int j = 0; j < s.length(); j++) {
//                 char c = s.charAt(j);
//                 int a = str[j] - '0';
//                 int b = str[j + 1] - '0';
//                 if (c == 'I') {
//                     if (a > b) {
//                         a = a ^ b;
//                         b = a ^ b;
//                         a = a ^ b;
//                         str[j] = (char) (a + '0');
//                         str[j + 1] = (char) (b + '0');
//                     }
//                 } 
//                 else {
//                     if (a < b) {
//                         a = a ^ b;
//                         b = a ^ b;
//                         a = a ^ b;
//                         str[j] = (char) (a + '0');
//                         str[j + 1] = (char) (b + '0');
//                     }
//                 }
//             }
//         }
//         int[] ans=new int[str.length];
//         int y=0;
//         for(char c:str){
//             ans[y]=c-'0';
//             y++;
//         }
//         return ans;
//     }
// }