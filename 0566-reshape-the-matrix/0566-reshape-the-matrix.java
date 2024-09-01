class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int[][] matrix=new int[r][c];
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                arr.add(mat[i][j]);
            }
        }
        if(arr.size()!=r*c){
            return mat;
        }
        int idx=0;
        for(int a=0;a<r;a++){
            for(int b=0;b<c;b++){
                matrix[a][b]=arr.get(idx);
                idx++;
            }
        }
        return matrix;
    }
}