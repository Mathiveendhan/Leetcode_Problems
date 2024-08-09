class Solution {
    public boolean isIsomorphic(String s, String t) {
        int[] indexS = new int[200]; 
        int[] indexT = new int[200]; 
        
        int len = s.length();
        if(len != t.length()) {
            return false;
        }
        for(int i = 0; i < len; i++) {
            if(indexS[s.charAt(i)] != indexT[t.charAt(i)]) {
                return false;
            }
            indexS[s.charAt(i)] = i + 1; 
            indexT[t.charAt(i)] = i + 1; 
        }
        return true;
    }
}


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         HashSet<Character> hash1=new HashSet<>();
//         HashSet<Character> hash2=new HashSet<>();
//         if(s.length()==t.length()){
//             for(int i=0;i<s.length();i++){
//                 hash1.add(s.charAt(i));
//             }
//             for(int j=0;j<t.length();j++){
//                 hash2.add(t.charAt(j));
//             }
//             if(hash1.size()==hash2.size()){
//                 return true;
//             }else{
//                 return false;
//             }
//         }else{
//             return false;
//         }
//     }
// }