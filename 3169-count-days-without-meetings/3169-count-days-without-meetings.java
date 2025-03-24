class Solution {
    public int countDays(int days, int[][] meetings) {
        Arrays.sort(meetings, (a, b) -> Integer.compare(a[0], b[0]));

        int meetingDaysCount = 0;
        int currentStart = -1, currentEnd = -1;

        for (int[] meeting : meetings) {
            int start = meeting[0], end = meeting[1];
            if (start > currentEnd) {
                if (currentEnd != -1) {
                    meetingDaysCount += (currentEnd - currentStart + 1);
                }
                currentStart = start;
                currentEnd = end;
            } else {
                currentEnd = Math.max(currentEnd, end);
            }
        }

        if (currentEnd != -1) {
            meetingDaysCount += (currentEnd - currentStart + 1);
        }

        return days - meetingDaysCount;
    }
}
// class Solution {
//     public static void call(int[] arr,boolean[] temp){
//         int a=arr[0];
//         int b=arr[1];
//         for(int i=a;i<=b;i++){
//             temp[i]=true;
//         }
//     }
//     public int countDays(int days, int[][] meetings) {
//        boolean[] temp=new boolean[days+1];
//        temp[0]=true;
//        int count=0;
//        for(int[] i:meetings){
//         call(i,temp);
//        }
//        for(boolean q:temp){
//         if(q==false){
//             count++;
//         }
//        }
//        return count;
//     }
// }