class Solution {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            String time = timePoints.get(i);
            int h = Integer.parseInt(time.substring(0, 2));
            int m = Integer.parseInt(time.substring(3));
            minutes[i] = h * 60 + m;
        }
        Arrays.sort(minutes);
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < minutes.length - 1; i++) {
            ans = Math.min(ans, minutes[i + 1] - minutes[i]);
        }
        return Math.min(
            ans,
            24 * 60 - minutes[minutes.length - 1] + minutes[0]
        );
    }
}


// class Solution {
//     public int findMinDifference(List<String> timePoints) {
//         ArrayList<Integer> arr=new ArrayList<>();
//         for(int i=0;i<timePoints.size();i++){
//             int num1=0;
//             if(timePoints.get(i).equals("00:00")){
//                 num1=1440;
//             }else{
//                 int a=Integer.parseInt((timePoints.get(i)).substring(0,2));
//                 int b=Integer.parseInt((timePoints.get(i)).substring(3));
//                 num1=(a*60)+b;
//             }
//             for(int j=i+1;j<timePoints.size();j++){
//                 int num2=0;
//                 if(timePoints.get(j).equals("00:00")){
//                 num2=1440;
//             }else{
//                 int x=Integer.parseInt((timePoints.get(j)).substring(0,2));
//                 int y=Integer.parseInt((timePoints.get(j)).substring(3));
//                 num2=(x*60)+y;
//             }
//             arr.add(Math.abs(num1-num2));
//             }
//         }
//         return Collections.min(arr);
//     }
// }