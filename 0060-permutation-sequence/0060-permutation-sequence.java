class Solution{
    static String getPermutation(int n, int k) {
        int fact = 1;
        ArrayList < Integer > numbers = new ArrayList < > ();
        for (int i = 1; i < n; i++) {
            fact = fact * i;
            numbers.add(i);
        }
        numbers.add(n);
        String ans = "";
        k = k - 1;
        while (true) {
            ans = ans + "" + numbers.get(k / fact);
            numbers.remove(k / fact);
            if (numbers.size() == 0) {
                break;
            }

            k = k % fact;
            fact = fact / numbers.size();
        }
        return ans;
    }
}



// class Solution{
//     static void swap(char s[], int i, int j) {
//         char ch = s[i];
//         s[i] = s[j];
//         s[j] = ch;
//     }
//     static void permutationHelper(char s[], int index, ArrayList<String> res) {
//         if (index == s.length) {
//             String str = new String(s);
//             res.add(str);
//             return;
//         }
//         for (int i = index; i < s.length; i++) {
//             swap(s, i, index);
//             permutationHelper(s, index + 1, res);
//             swap(s, i, index);
//         }
//     }
//     static String getPermutation(int n, int k) {
//         String s = "";
//         ArrayList<String> res = new ArrayList<>();
//         for (int i = 1; i <= n; i++) {
//             s += i;
//         }
//         permutationHelper(s.toCharArray(), 0, res);
//         Collections.sort(res);
//         return res.get(k - 1);
//     }
// }

// class Solution {
//     public static String convert(ArrayList<String> ds){
//         StringBuilder sb=new StringBuilder("");
//         for(String s:ds){
//             sb.append(s);
//         }
//         return sb.toString();
//     }
//     public static void call(int[] nums,boolean[] temp,ArrayList<String> ds,ArrayList<String> ans){
//         if(ds.size()==nums.length){
//             ans.add(convert(ds));
//             return;
//         }
//         for(int i=0;i<nums.length;i++){
//             if(!temp[i]){
//                 temp[i]=true;
//                 ds.add(nums[i]+"");
//                 call(nums,temp,ds,ans);
//                 ds.remove(ds.size()-1);
//                 temp[i]=false;
//             }
//         }
//     }
//     public String getPermutation(int n, int k) {
//         int[] nums=new int[n];
//         for(int i=0;i<n;i++){
//             nums[i]=i+1;
//         }
//         ArrayList<String> ans=new ArrayList<>();
//         ArrayList<String> ds=new ArrayList<>();
//         boolean[] temp=new boolean[n];
//         call(nums,temp,ds,ans);
//         Collections.sort(ans);
//         return ans.get(k-1);
//     }
// }