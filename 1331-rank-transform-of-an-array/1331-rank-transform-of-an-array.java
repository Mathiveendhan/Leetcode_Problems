class Solution {
    public int[] arrayRankTransform(int[] arr) {
      int[] dup=arr.clone();
      Arrays.sort(dup);
      HashMap<Integer,Integer> map=new HashMap<>();
      int c=1;
      for(int i=0;i<arr.length;i++){
        if(!map.containsKey(dup[i])){
            map.put(dup[i],c);
            c++;
        }
      }
      int[] rank=new int[arr.length];
      for(int j=0;j<arr.length;j++){
        rank[j]=map.get(arr[j]);
      }
      return rank;
    }
}