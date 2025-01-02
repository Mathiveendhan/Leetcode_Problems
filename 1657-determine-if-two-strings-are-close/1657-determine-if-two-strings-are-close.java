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

        ArrayList<Integer> arr1=new ArrayList<>();
        ArrayList<Integer> arr2=new ArrayList<>();

        for(int i:m1.keySet()){
            arr1.add(i);
        }

        for(int j:m2.keySet()){
            arr2.add(j);
        }

        Collections.sort(arr1);
        Collections.sort(arr2);

        return arr1.equals(arr2);
        }
}