class Solution {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        for (int q=0;q<s.length();q++) {
            freq[s.charAt(q) - 97]++;
                  // or 
            // freq[s.charAt(q) - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;

    }
}

// class Solution {
//     public int firstUniqChar(String s) {
//         HashMap<Character,Integer> map=new HashMap<>();
//         for(char c:s.toCharArray()){
//             if(!map.containsKey(c)){
//                 map.put(c,1);
//             }else{
//                 map.put(c,map.get(c)+1);
//             }
//         }

//         for(int i=0;i<s.length();i++){
//             if(map.get(s.charAt(i))==1){
//                 return i;
//             }
//         }
//         return -1;
//     }
// }