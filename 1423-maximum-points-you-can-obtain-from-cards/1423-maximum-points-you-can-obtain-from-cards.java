class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int max=0,maxAns=0;
        for(int w=0;w<k;w++){
            max+=cardPoints[w];
        }

        int leftIndex=k-1,rightIndex=cardPoints.length-1;
        while(leftIndex>=0){
            max-=cardPoints[leftIndex];
            max+=cardPoints[rightIndex];
            maxAns=Math.max(max,maxAns);
            leftIndex--;
            rightIndex--;
        }

        return maxAns;
    }
}