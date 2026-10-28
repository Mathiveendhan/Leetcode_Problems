class Solution {
    static int rec(int i,int j,int n,int m, HashMap<String,Integer> map){
        if(i>n || j>m){
            return 0;
        }
        if(i==n-1 && j==m-1){
            return 1;
        }
        String str=i+" "+j;
        if(map.containsKey(str)){
            return map.get(str);
        }
        int right=rec(i+1, j, n, m,map);
        int bottom=rec(i, j+1, n, m,map);
        map.put(str,right+bottom);
        return right+bottom;
    }
    public int uniquePaths(int m, int n) {
        HashMap<String,Integer> map=new HashMap<>();
        return rec(0,0,n,m,map);
    }
}