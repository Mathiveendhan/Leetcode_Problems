class Solution {
    public int maximumSwap(int num) {
        char[] numArr = Integer.toString(num).toCharArray();
        int n = numArr.length;

        int[] last = new int[10];
        for (int i = 0; i < n; i++) {
            last[numArr[i] - '0'] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int d = 9; d > numArr[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = numArr[i];
                    numArr[i] = numArr[last[d]];
                    numArr[last[d]] = temp;
                    return Integer.parseInt(new String(numArr));
                }
            }
        }
        return num;
    }
}





// class Solution {
//     public static int call(char[] ch, int idx, int max) {
//         char temp = ch[idx];
//         ch[idx] = ch[idx + 1];
//         ch[idx + 1] = temp;

//         int n = Integer.parseInt(new String(ch));
//         temp = ch[idx];
//         ch[idx] = ch[idx + 1];
//         ch[idx + 1] = temp;

//         return Math.max(n, max);
//     }

//     public int maximumSwap(int num) {
//         int max = num;
//         String s = Integer.toString(num);
//         char[] ch = s.toCharArray();
//         for (int i = 0; i < ch.length - 1; i++) {
//             max = call(ch, i, max);
//         }
//         return max;  
//     }
// }
