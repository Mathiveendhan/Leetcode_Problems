class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> map=new HashMap<>();
        ArrayList<String> arrr=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(arr[i])){
                map.put(arr[i],1);
                arrr.add(arr[i]);
            }else{
                map.put(arr[i],map.get(arr[i])+1);
            }
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int j=0;j<arrr.size();j++){
            if(map.get(arrr.get(j))==1){
                ans.add(arrr.get(j));
            }
        }
        if (k > 0 && k <= ans.size()) {
            return ans.get(k - 1);
        }
        return "";
    }
}