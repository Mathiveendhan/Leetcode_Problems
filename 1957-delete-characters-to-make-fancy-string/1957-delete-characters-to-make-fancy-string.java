class Solution {
    public String makeFancyString(String s) {
        StringBuilder result = new StringBuilder();
        for (char c : s.toCharArray()) {
            int n = result.length();
            if (n < 2 || !(result.charAt(n - 1) == c && result.charAt(n - 2) == c)) {
                result.append(c);
            }
        }
        return result.toString();
    }
}



// class Solution {
//     public String makeFancyString(String s) {
//        ArrayList<Character> arr=new ArrayList<>();
//        for(char c:s.toCharArray()){
//         arr.add(c);
//        } 
//        for(int i=0;i<arr.size();i++){
//         char ch=arr.get(i);
//         if (i >= 2 && arr.get(i) == arr.get(i - 1) && arr.get(i) == arr.get(i - 2)) {
//                 arr.remove(i);
//                 i--; 
//             }
//        }
//        StringBuilder sb=new StringBuilder("");
//        for(char cc:arr){
//         sb.append(cc);
//        }
//        return sb.toString();
//     }
// }