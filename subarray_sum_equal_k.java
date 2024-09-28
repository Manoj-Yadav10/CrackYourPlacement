class Solution {
    public int subarraySum(int[] nums, int k) {
        int count=0;
        HashMap<Integer, Integer> hm = new HashMap<>();
        int presum=0;
        hm.put(presum,1);
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            int rem= presum-k;
            if(hm.containsKey(rem)){
                count+=hm.get(rem);
            }
            hm.put(presum,hm.getOrDefault(presum,0)+1);
        }
        return count;
    }
}
