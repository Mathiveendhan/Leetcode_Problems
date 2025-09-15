class Solution {
    public int totalFruit(int[] fruits) {
       int l=0,r=0,maxlen=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        if(fruits.length<=2) return fruits.length;
        while(l<fruits.length){
            map.put(fruits[l],map.getOrDefault(fruits[l], 0)+1);
            if(map.size()<=2){
                maxlen=Math.max(maxlen,l-r+1);
            }
            if(map.size()>2){
                while(!(map.size()==2)){
                    //map.remove(arr[l]);
                    map.put(fruits[r],map.get(fruits[r])-1);
                    if(map.get(fruits[r])==0){
                        map.remove(fruits[r]);
                    }
                    r++;
                }
            }
            l++;
        }
        return maxlen; 
    }
}