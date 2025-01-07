class Solution {
    public String shiftingLetters(String s, int[] shifts) {
        int[] shiftArr = new int[s.length()];
        int currShift = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            currShift = (currShift + shifts[i]) % 26;
            shiftArr[i] = currShift;
        }
        StringBuilder res = new StringBuilder();
        char[] chars = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            res.append((char) ((chars[i] - 'a' + shiftArr[i]) % 26 + 'a'));
        }
        return res.toString();
    }
}


// class Solution {

//     public static String call(int shift, int j, String word) {
//         StringBuilder sb = new StringBuilder(word);
//         for (int i = 0; i <= j; i++) {
//             char ch = sb.charAt(i);
//             int num = (ch - 'a' + shift) % 26;
//             sb.setCharAt(i, (char) ('a' + num));
//         }
//         return sb.toString();
//     }

//     public String shiftingLetters(String s, int[] shifts) {
//         for (int i = 0; i < shifts.length; i++) {
//             s = call(shifts[i], i, s);
//         }
//         return s;
//     }
// }
