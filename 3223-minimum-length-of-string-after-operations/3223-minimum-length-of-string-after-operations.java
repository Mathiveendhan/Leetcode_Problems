class Solution {
    public int minimumLength(String s) {
        int[] charFrequency = new int[26];
        int totalLength = 0;
        for (char c : s.toCharArray()) {
            charFrequency[c - 'a']++;
        }
        for (int frequency : charFrequency) {
            if (frequency == 0) continue;
            if (frequency % 2 == 0) {
                totalLength += 2;
            } else {
                totalLength += 1;
            }
        }
        return totalLength;
    }
}


// class Solution {
//     public int minimumLength(String s) {
//         char[] ch = s.toCharArray();
//         for (int i = 0; i < ch.length; i++) {
//             char c = ch[i];
//             int front = 0;
//             int back = 0;
//             int frontInd = -1;
//             int backInd = -1;
//             for (int a = i; a >= 0; a--) {
//                 if (a != i && ch[a] == c) {
//                     front++;
//                     frontInd = a;
//                     break;
//                 }
//             }

//             for (int b = i; b < ch.length; b++) {
//                 if (b != i && ch[b] == c) {
//                     back++;
//                     backInd = b;
//                     break;
//                 }
//             }

//             if (front != 0 && back != 0) {
//                 ch[frontInd] = '0';
//                 ch[backInd] = '0';
//             }
//         }
//         int len = 0;
//         for (char q : ch) {
//             if (q != '0') {
//                 len++;
//             }
//         }
//         return len;
//     }
// }