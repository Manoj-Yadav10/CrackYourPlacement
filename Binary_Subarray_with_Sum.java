class Solution {
    public int calculate(int[] nums, int goal) {
       int count=0;
       int i=0,j=0;
       int sum=0;
   
       while(j<nums.length){
        sum+=nums[j];
        while(sum>goal &&i<=j ){
            sum-=nums[i];
            i++;
        }
        if(sum<=goal){
            count+=j-i+1;
            
        }
        j++;
       }
       
       return count;
    }
    public int numSubarraysWithSum(int[] nums,int goal){
        int ans1=calculate(nums,goal);
        int ans2=calculate(nums,goal-1);
        return ans1-ans2;
    }
}
