class Solution {
    public String longestCommonPrefix(String[] str) {
        String compare=str[0];
        for(int i=1;i<str.length;i++){
            while(str[i].indexOf(compare)!=0){
                compare=compare.substring(0,compare.length()-1);
            }
        }
        return compare;
    }
}


//class Solution {
//     public String longestCommonPrefix(String[] strs) {
//         Arrays.sort(strs);
//         String f=strs[0];
//         String l=strs[strs.length-1];
//         int i=0;
//         while(i<f.length() && i<l.length()){
//             if(f.charAt(i)==l.charAt(i)){
//                 i++;
//             }else{
//                 break;
//             }
//         }
//         return f.substring(0,i);
//     }
// }