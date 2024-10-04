class Solution {
    public int longestOnes(int[] nums, int k) {
       int maxLen=0;
    int i=0;
    int j=0;
    int zeros=0;
    while(j<nums.length){
        if(nums[j]==0){
            zeros++;
        }
        if(zeros>k){
            if(nums[i]==0){
                zeros--;
            }
            i++;

        }
        if(zeros<=k){
           int len=j-i+1;
            maxLen=Math.max(len,maxLen);
        }
        j++;
    }
    return maxLen;
    }
}
