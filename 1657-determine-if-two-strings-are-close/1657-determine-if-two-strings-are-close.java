class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length()){
            return false;
        }
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();

        for(char c:word1.toCharArray()){
           if(!m1.containsKey(c)){
            m1.put(c,1);
           }else{
            m1.put(c,m1.get(c)+1);
           }
        }

        for(char cc:word2.toCharArray()){
           if(!m2.containsKey(cc)){
            m2.put(cc,1);
           }else{
            m2.put(cc,m2.get(cc)+1);
           }
        }

        if (!m1.keySet().equals(m2.keySet())) {
            return false;
        }

        ArrayList<Integer> arr1 = new ArrayList<>(m1.values());
        ArrayList<Integer> arr2 = new ArrayList<>(m2.values());

        Collections.sort(arr1);
        Collections.sort(arr2);

        return arr1.equals(arr2);
        }
}