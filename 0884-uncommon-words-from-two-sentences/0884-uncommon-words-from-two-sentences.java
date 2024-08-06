class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        List<String> ls=new ArrayList<>();
        String[] str1=s1.split(" ");
        String[] str2=s2.split(" ");
        
        Map<String,Integer> hm=new HashMap<>();
        for(String s:str1){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(String s:str2){
            hm.put(s,hm.getOrDefault(s,0)+1);
        }
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                ls.add(e.getKey());
            }
        }
        String[] ans=new String[ls.size()];
        int x=0;
        for(String s:ls){
            ans[x++]=s;
        }
        return ans;

    }
}