class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double maxDiagonal = -1;
        int maxArea = 0;

        for (int i = 0; i < dimensions.length; i++) {
            int width = dimensions[i][0];
            int height = dimensions[i][1];

            double diagonal = Math.sqrt((width * width) + (height * height));
            int area = width * height;

            if (diagonal > maxDiagonal) {
                maxDiagonal = diagonal;
                maxArea = area;
            } else if (diagonal == maxDiagonal) {
                maxArea = Math.max(maxArea, area);
            }
        }

        return maxArea;
    }
}
