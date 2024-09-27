class Solution {
    public int maxArea(int[] height) {
       int maxWater=Integer.MIN_VALUE;
       int left=0;
       int right=height.length-1;
       while(left<right){
        int length=right-left;
        int ht=(height[left]<=height[right])?height[left]:height[right];
        int area=length*ht;
        if(area>maxWater){
            maxWater=area;
        }
        if(height[left]>height[right]){
            right--;
        }
        else{
            left++;
        }
       }
       return maxWater;
    }
}
