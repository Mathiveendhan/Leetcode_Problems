class Solution {
    public int[][] merge(int[][] intervals) {
        // i have sorted it before start the process
       Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
       int[] temp = new int[intervals.length];
       ArrayList<Integer> elements = new ArrayList<>();
       
       for(int i = 0; i < intervals.length; i++) {
           int a = intervals[i][0];
           int b = intervals[i][1];
           boolean overlaps = false;
           for(int j = a; j <= b; j++) {
               if(elements.contains(j)) {
                   overlaps = true;
                   break;
               }
           }
           temp[i] = overlaps ? 1 : 0;
           for(int j = a; j <= b; j++) {
               elements.add(j);
           }
       } 
       
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
       ArrayList<Integer> arr = new ArrayList<>();
       
       for(int q = 0; q < temp.length; q++) {
           if(!ans.isEmpty() && (temp[q] != 0 || intervals[q][0] <= ans.get(ans.size()-1).get(1))) {
               ArrayList<Integer> last = ans.remove(ans.size() - 1);
               arr.clear();
               arr.add(Math.min(last.get(0), intervals[q][0]));
               arr.add(Math.max(last.get(1), intervals[q][1]));
               ans.add(new ArrayList<>(arr));
           } else {
               arr.clear();
               arr.add(intervals[q][0]);
               arr.add(intervals[q][1]);
               ans.add(new ArrayList<>(arr));
           }
       }
       
       int[][] matrix = new int[ans.size()][2];
       for(int x = 0; x < ans.size(); x++) {
           for(int y = 0; y < 2; y++) {
               matrix[x][y] = ans.get(x).get(y);
           }
       }
       return matrix;
    }
}

// class Solution {
//     public static void call(int[] ar,  ArrayList<ArrayList<Integer>>ans, ArrayList<Integer> element,int n){
//         int a=ar[0];
//         int b=ar[1];
//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int i=a;i<=b;i++){
//             if(!element.contains(i)){
//                 element.add(i);
//             }else{
//                 ans.get(n).set(1,b);
//                 return;
//             }
//         }
//         arr.add(a);
//         arr.add(b);
//         ans.add(arr);
//         return;
//     }
//     public int[][] merge(int[][] intervals) {
//         Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
//         ArrayList<Integer> element=new ArrayList<>();
//          ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
//          for(int[] i:intervals){
//             call(i,ans,element,ans.size()-1);
//          }
//          int[][] matrix=new int[ans.size()][2];
//          for(int x=0;x<ans.size();x++){
//             for(int y=0;y<2;y++){
//                 matrix[x][y]=ans.get(x).get(y);
//             }
//          }
//          return matrix;

//     }
// }