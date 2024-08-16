class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        if (arrays == null || arrays.size() < 2) return 0;

        int globalMin = arrays.get(0).get(0);
        int globalMax = arrays.get(0).get(arrays.get(0).size() - 1);
        int result = 0;

        for (int i = 1; i < arrays.size(); i++) {
            List<Integer> curr = arrays.get(i);
            int localMin = curr.get(0);
            int localMax = curr.get(curr.size() - 1);

            result = Math.max(result, Math.max(localMax - globalMin, globalMax - localMin));

            globalMin = Math.min(globalMin, localMin);
            globalMax = Math.max(globalMax, localMax);
        }

        return result;
    }
}

// import java.util.List;

// class Solution {
//     public static int call(List<Integer> arr1, List<Integer> arr2) {
//         int maxx = 0;
//         for (int a = 0; a < arr1.size(); a++) {
//             for (int b = 0; b < arr2.size(); b++) {
//                 int dif = Math.abs(arr1.get(a) - arr2.get(b));
//                 if (maxx < dif) { 
//                     maxx = dif;
//                 }
//             }
//         }
        
//         return maxx;
//     }

//     public int maxDistance(List<List<Integer>> arrays) {
//         int max = 0;

//         for (int i = 0; i < arrays.size(); i++) {
//             for (int j = 0; j < arrays.size(); j++) { 
//                 if (i != j) { 
//                     List<Integer> Iarr = arrays.get(i);
//                     List<Integer> Jarr = arrays.get(j);
//                     int diff = call(Iarr, Jarr);
//                     if (max < diff) { 
//                         max = diff;
//                     }
//                 }
//             }
//         }
        
//         return max;
//     }
// }
