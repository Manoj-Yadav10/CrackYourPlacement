class Solution {
    public int maxScore(int[] cardPoints, int k) {
       int maxSum=0;
       int lsum=0;
       for(int i=0;i<k;i++){
        lsum+=cardPoints[i];
       }
       maxSum=lsum;
       int rindex=cardPoints.length-1;
       int rsum=0;
       for(int i=k-1;i>=0;i--){
        rsum+=cardPoints[rindex];
        rindex--;
        lsum-=cardPoints[i];
        maxSum=Math.max(maxSum,lsum+rsum);
       }
return maxSum;
    }
}
