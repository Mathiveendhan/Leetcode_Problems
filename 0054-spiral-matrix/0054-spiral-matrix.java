class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
         List<Integer> list=new ArrayList<>();
         if(matrix.length==1){
            for(int z:matrix[0]){
                list.add(z);
            }
            return list;
        }
        for(int a=0;a<(Math.min(matrix.length,matrix[0].length)+1)/2;a++){
            for(int i=0+a;i<=(matrix[a].length-1)-a;i++){
                list.add(matrix[a][i]);
            }
            for(int j=1+a;j<matrix.length-a;j++){
                list.add(matrix[j][(matrix[a].length-1)-a]);
            }
            if((matrix.length-1)-a>a){
            for(int k=(matrix[a].length-2)-a;k>=a;k--){
                list.add(matrix[(matrix .length-1)-a][k]);
            }
            }
            if((matrix[a].length-1)-a>a){
            for(int l=(matrix.length-2)-a;l>=1+a;l--){
                list.add(matrix[l][a]);
            }
          }
        }
        return list;
    }
}