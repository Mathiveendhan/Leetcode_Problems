class Solution {
    public static boolean checkAnagram(String s1,String s2){
        char[] se1=s1.toCharArray();
        char[] se2=s2.toCharArray();
        Arrays.sort(se1);
        Arrays.sort(se2);
        return Arrays.equals(se1,se2);
    }
    public List<String> removeAnagrams(String[] words) {
        List<String> arr=new ArrayList<>();
        for(String word:words){
            arr.add(word);
        }
        for(int i=0;i<arr.size();i++){
            if(i<arr.size()-1){
                if(checkAnagram(arr.get(i),arr.get(i+1))){
                    arr.remove(i+1);
                    i=-1;
                }     
            }
        }
        return arr;
    }
}