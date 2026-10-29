class Solution {
    public int minOperations(String s) {
        int n = s.length();

        char min = s.charAt(0);
        char max = s.charAt(0);
        boolean sorted = true;

        for (int i = 1; i < n; i++) {
            char current = s.charAt(i);

            min = (char) Math.min(min, current);
            max = (char) Math.max(max, current);

            if (current < s.charAt(i - 1)) {
                sorted = false;
            }
        }
        if (sorted) {
            return 0;
        }

        // An unsorted two-character string cannot be changed
        if (n == 2) {
            return -1;
        }

        if (s.charAt(0) == min || s.charAt(n - 1) == max) {
            return 1;
        }

        for (int i = 1; i < n - 1; i++) {
            if (s.charAt(i) == min || s.charAt(i) == max) {
                return 2;
            }
        }

        return 3;
    }
}
// class Solution {
//     static boolean check(char[] arr,int l,int r){
//         for(int i=l;i<r;i++){
//             if(arr[i]>arr[i+1]){
//                 return true;
//             }
//         }
//         return false;
//     }
//     static void sort(char[] arr,int l,int r){
//         for(int i=l;i<r;i++){
//             if(i+1<arr.length && arr[i]>arr[i+1]){
//                 char temp=arr[i];
//                 arr[i]=arr[i+1];
//                 arr[i+1]=temp;
//             }
//         }
//     }
//     public int minOperations(String s) {
//         if(s.length()<3) return -1;
//         int l=s.length()-2;
//         char[] arr=s.toCharArray();
//         int count=0;
    
//         if(check(arr,0,l)){
//             count++;
//             sort(arr,0,l);
//         }
//         if(check(arr,1,s.length()-1)){
//             count++;
//             sort(arr,0,s.length()-1);
//         }
//         if(check(arr,0,l)){
//             count++;
//             sort(arr,0,l);
//         }
//         return check(arr, 0, arr.length - 1) ? -1 : count;
//     }
// }

// // class Solution {
// //     static boolean check(char[] arr){
// //         for(int i=0;i<arr.length-1;i++){
// //             if(arr[i]>arr[i+1]){
// //                 return true;
// //             }
// //         }
// //         return false;
// //     }
// //     static void sort(char[] arr,int l,int r){
// //         for(int i=l;i<=r;i++){
// //             if(i+1<arr.length && arr[i]>arr[i+1]){
// //                 char temp=arr[i];
// //                 arr[i]=arr[i+1];
// //                 arr[i+1]=temp;
// //             }
// //         }
// //     }
// //     public int minOperations(String s) {
// //         if(s.length()<3) return -1;
// //         int l=s.length()-1,count=0;
// //         char[] arr=s.toCharArray();
// //         for(int i=0;i<arr.length;i++){
// //             if(i+l<arr.length && check(arr))
// //             count++;
// //             sort(arr,i,i+l);
// //         }
// //         System.out.print(new String(arr));
// //         return count;
// //     }
// // }

// // class Solution {
// //     static boolean call(char[] arr){
// //         for(int i=0;i<arr.length-1;i++){
// //             if(arr[i]>arr[i+1]){
// //                 return true;
// //             }
// //         }
// //         return false;
// //     }
// //     public int minOperations(String s) {
// //         if(s.length()<3) return -1;
// //         char[] arr=s.toCharArray();
// //         int i=0,j=1,count=0;
// //         while(call(arr)){
// //             if(arr[i]>arr[j]){
// //                 count++;
// //                 char temp=arr[i];
// //                 arr[i]=arr[j];
// //                 arr[j]=temp;
// //             }
// //             i++;
// //             j++;
// //             if(j==arr.length){
// //                 i=0;
// //                  j=1;
// //             }
// //         }
// //         return count;
// //     }
// // }