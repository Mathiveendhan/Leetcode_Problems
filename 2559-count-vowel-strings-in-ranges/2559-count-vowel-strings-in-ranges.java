// class Solution {
//     public static int call(String[] words,int[] queries,ArrayList<Character> arr){
//         int ans=0;
//         for(int i=queries[0];i<=queries[1];i++){
//             int len=words[i].length();
//             if(arr.contains(words[i].charAt(0)) && arr.contains(words[i].charAt(len-1))){
//                 ans++;
//             }
//         }
//         return ans;
//     }
//     public int[] vowelStrings(String[] words, int[][] queries) {
//        int[] ans=new int[queries.length];
//        ArrayList<Character> arr=new ArrayList<>();
//         arr.add('a');
//         arr.add('e');
//         arr.add('i');
//         arr.add('o');
//         arr.add('u');
//        for(int i=0;i<queries.length;i++){
//         ans[i]=call(words,queries[i],arr);
//        } 
//        return ans;
//     }
// }

class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        int[] Prefix = new int[n + 1];
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));

        for (int i = 0; i < n; i++) {
            Prefix[i + 1] = Prefix[i];
            if (vowels.contains(words[i].charAt(0)) && vowels.contains(words[i].charAt(words[i].length() - 1))) {
                Prefix[i + 1]++;
            }
        }

        int[] ANS = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            ANS[i] = Prefix[queries[i][1] + 1] - Prefix[queries[i][0]];
        }
        return ANS;
    }
}