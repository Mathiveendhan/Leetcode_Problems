class Solution {
     public static void call(int[][] matrix,int row,int col){
        for(int i=0;i<matrix[0].length;i++){
            matrix[row][i]=0;
        }

        for(int j=0;j<matrix.length;j++){
            matrix[j][col]=0;
        }
    }
    public void setZeroes(int[][] matrix) {
        int[][] check=matrix.clone();

        for(int a=0;a<matrix.length;a++){
            check[a]=matrix[a].clone();
        }
        

        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==0 && check[i][j]==0)  call(matrix,i,j);
            }
        }
        
    }
}