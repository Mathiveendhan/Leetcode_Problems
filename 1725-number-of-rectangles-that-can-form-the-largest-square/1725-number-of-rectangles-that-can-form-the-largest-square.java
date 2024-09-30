import java.util.ArrayList;

class Solution {
    public int countGoodRectangles(int[][] rectangles) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < rectangles.length; i++) {
            int min = Math.min(rectangles[i][0], rectangles[i][1]); 
            arr.add(min);
        }

        int max = 0;
        for (int it : arr) {
            if (it > max) {
                max = it;
            }
        }

        int c = 0;
        for (int itt : arr) {
            if (max == itt) {
                c++;
            }
        }
        return c;
    }
}
