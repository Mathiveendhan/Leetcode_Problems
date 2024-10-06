class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        String[] words1 = sentence1.split(" ");
        String[] words2 = sentence2.split(" ");
        if (words1.length < words2.length) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        
        int n1 = words1.length;
        int n2 = words2.length;
        int left = 0;
        while (left < n2 && words1[left].equals(words2[left])) {
            left++;
        }
        
        int right = 0;
        while (right < n2 && words1[n1 - 1 - right].equals(words2[n2 - 1 - right])) {
            right++;
        }
        return left + right >= n2;
    }
}

// class Solution {
//     public boolean areSentencesSimilar(String sentence1, String sentence2) {
//         String[] str1=sentence1.split(" ");
//         String[] str2=sentence2.split(" ");
//         if(str1.length<str2.length){
//             return false;
//         }
//         String ans[]=new String[str1.length];
//         int idx1=0;
//         int idx2=0;
//         int count=0;
//         for(int i=0;i<str1.length;i++){
//             for(int j=0;j<str2.length;j++){
//                 if(str1[i].equals(str2[j]) && count==0){
//                     idx1=i;
//                     idx2=j;
//                     count++;
//                     break;
//                 }
//             }
//         }
//         if(count==0){
//             return false;
//         }
//         StringBuilder sb=new StringBuilder("");
//         for(int k=idx1;k<str1.length;k++){
//             sb.append(str1[k]);
//             if(k!=str1.length-1){
//                 sb.append(" ");
//             }
//         }
//         String answer=sb.toString();
//         if(answer.equals(sentence1)){
//             return true;
//         }else{
//             return false;
//         }
//     }
// }