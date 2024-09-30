class Solution {
    public int subarraysDivByK(int[] nums, int k) {
      
        int count=0;
        HashMap<Integer , Integer> hm = new HashMap<>();
        int preRem=0;
        hm.put(preRem,1);
        int presum=0;
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
             int rem=presum%k;
             if(rem<0){
                rem+=k;
             }
             if(hm.containsKey(rem)){
                count+=hm.get(rem);
             }
             hm.put(rem,hm.getOrDefault(rem,0)+1);
        }
        return count;
    }
}
