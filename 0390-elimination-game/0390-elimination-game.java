class Solution {
    public int lastRemaining(int n) {
        return n == 1 ? 1 : 2 * (1 + n / 2 - lastRemaining(n / 2));
    }
}


// import java.util.ArrayList;

// class Solution {
//     public static int print(ArrayList<Integer> arr, int n) {
//         if (arr.size() == 1) {
//             return arr.get(0);
//         }
//         ArrayList<Integer> temp = new ArrayList<>(); 
//         if (n%2==1){
//             for(int i=1;i<arr.size();i+=2) {
//                 temp.add(arr.get(i));
//             }
//         } else {
//             for(int j=arr.size()-2;j>=0;j-=2){
//                 temp.add(arr.get(j));
//             }
//         }
//         return print(temp,n+1);
//     }

//     public int lastRemaining(int n) {
//         ArrayList<Integer> arr = new ArrayList<>();
//         for (int i = 1; i <= n; i++) {
//             arr.add(i);
//         }  
//         return print(arr, 0);
//     }
// }