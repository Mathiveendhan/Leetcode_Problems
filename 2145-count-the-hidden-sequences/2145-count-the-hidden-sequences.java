class Solution {
    public int numberOfArrays(int[] difference, int lower, int upper) {
        long min = 0, max = 0, sum = 0;

        for (int diff : difference) {
            sum += diff;
            min = Math.min(min, sum);
            max = Math.max(max, sum);
        }

        long range = max - min;
        long totalRange = upper - lower;

        long result = totalRange - range + 1;
        return (int)Math.max(0, result);
    }
}


// class Solution {
//     static int out = 0;

//     public static void call(int i, int[] difference, int[] ans, int lower, int upper) {
//         if (i == ans.length) {
//             out++;
//             return;
//         }

//         for (int val = lower; val <= upper; val++) {
//             if (i == 0) {
//                 ans[i] = val;
//                 call(i + 1, difference, ans, lower, upper);
//             } else {
//                 if (val - ans[i - 1] == difference[i - 1]) {
//                     ans[i] = val;
//                     call(i + 1, difference, ans, lower, upper);
//                 }
//             }
//         }
//     }

//     public int numberOfArrays(int[] difference, int lower, int upper) {
//         out = 0;
//         int[] ans = new int[difference.length + 1];
//         call(0, difference, ans, lower, upper);
//         return out;
//     }
// }
