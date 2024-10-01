class Solution{
    static long maximumSumSubarray(int K, ArrayList<Integer> Arr,int N){
        // code here
        long maxSum=Integer.MIN_VALUE;
        long curSum=0;
        int j=0;
      int i=0;
      
            
            while(j<N){
                curSum+=Arr.get(j);
                if((j-i+1)<K){
                    j++;
                }
                else if ((j-i+1)==K){
                    maxSum=Math.max(maxSum,curSum);
                    curSum-=Arr.get(i);
                    j++;
                    i++;
                }
                
            
        }
        return maxSum;
    }
}
