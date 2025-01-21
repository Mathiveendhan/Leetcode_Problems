class Solution {
    public int firstCompleteIndex(int[] arr, int[][] mat) {
        
        int[] row=new int[mat[0].length];
        int[] col=new int[mat.length];
        HashMap<Integer,int[]>map=new HashMap<>();
        for(int i=0;i<mat.length;++i){
            for(int j=0;j<mat[0].length;++j){
                map.put(mat[i][j],new int[]{i,j});
            }
        }
        for(int i=0;i<arr.length;++i){
            int[] a=map.get(arr[i]);
            row[a[1]]++;
           col[a[0]]++;
            if(row[a[1]]==mat.length)return i;
            if(col[a[0]]==mat[0].length)return i;
        }
        return -1;
    }
   
}

// class Solution {
//     public static boolean check(int[][] paint, int rlen, int clen, int r, int c) {
//         int row = 0;
//         int column = 0;
//         for (int i = 0; i < clen; i++) {
//             if (paint[r][i] == 1) {
//                 row++;
//             }
//         }
//         for (int j = 0; j < rlen; j++) {
//             if (paint[j][c] == 1) {
//                 column++;
//             }
//         }
//         if (row == clen || column == rlen) {
//             return true;
//         }
//         return false;
//     }

//     public static int firstCompleteIndex(int[] arr, int[][] mat) {
//         int paint[][] = new int[mat.length][mat[0].length];
//         int rlen = mat.length;
//         int clen = mat[0].length;
//         for (int a = 0; a < arr.length; a++) {
//             for (int i = 0; i < mat.length; i++) {
//                 for (int j = 0; j < mat[i].length; j++) {
//                     if (mat[i][j] == arr[a]) {
//                         paint[i][j] = 1;
//                         if (check(paint, rlen, clen, i, j)) {
//                             return a;
//                         }
//                         break;
//                     }
//                 }
//             }
//         }

//         return -1;
//     }
// }