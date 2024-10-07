public class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] f1 = new int[26];
        int[] f2 = new int[26];
        int[] f3 = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            f1[s1.charAt(i) - 'a']++;
            f2[s2.charAt(i) - 'a']++;
        }

        int matches = 0;
        for (int i = 0; i < 26; i++) {
            if (f1[i] == f2[i]) {
                f3[i] = 1;
                matches++;
            }
        }
        
        for (int i = s1.length(); i < s2.length(); i++) {
            if (matches == 26) return true;

            int tlli = s2.charAt(i - s1.length()) - 'a';
            int trli = s2.charAt(i) - 'a';

            f2[tlli]--;
            f2[trli]++;
            
            if (tlli == trli) continue;
            
            if (f1[tlli] == f2[tlli]) {
                f3[tlli] = 1;
                matches++;
            } else if (f3[tlli] == 1) {
                f3[tlli] = 0;
                matches--;
            }

            if (f1[trli] == f2[trli]) {
                f3[trli] = 1;
                matches++;
            } else if (f3[trli] == 1) {
                f3[trli] = 0;
                matches--;
            }
        }
        
        return matches == 26;
    }
}

// class Solution {
//     public boolean checkInclusion(String s1, String s2) {
//         int l1 = s1.length();
//         for (int i = 0; i <= s2.length() - l1; i++) { 
//             if (s2.substring(i, i + l1).equals(s1)) {
//                 return true;
//             }
//             StringBuilder sb = new StringBuilder(s2.substring(i, i + l1)).reverse();
//             if (sb.toString().equals(s1)) {
//                 return true;
//             }
//         }
//         return false;
//     }
// }
