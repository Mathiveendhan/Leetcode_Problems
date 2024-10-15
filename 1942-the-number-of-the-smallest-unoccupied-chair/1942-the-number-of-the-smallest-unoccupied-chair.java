import java.util.PriorityQueue;
import java.util.Arrays;

class Solution {
    public int smallestChair(int[][] times, int targetFriend) {
        int nextChair = 0;
        int targetStart = times[targetFriend][0];

        Arrays.sort(times, (a, b) -> a[0] - b[0]);
        PriorityQueue<int[]> leaveChair = new PriorityQueue<>((a, b) -> a[0] - b[0]);
        PriorityQueue<Integer> availableChairs = new PriorityQueue<>();
        for (int[] time : times) {
            int start = time[0], leave = time[1];

            while (!leaveChair.isEmpty() && leaveChair.peek()[0] <= start) {
                availableChairs.add(leaveChair.poll()[1]);
            }

            int sat;
            if (!availableChairs.isEmpty()) {
                sat = availableChairs.poll();
            } else {
                sat = nextChair++;
            }

            leaveChair.add(new int[]{leave, sat});

            if (start == targetStart) {
                return sat;
            }
        }

        return -1; 
    }
}