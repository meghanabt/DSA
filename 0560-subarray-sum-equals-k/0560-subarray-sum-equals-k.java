class Solution {
    public int subarraySum(int[] nums, int k) {
        
        HashMap<Integer,Integer> preSum= new HashMap<>();
        int sum=0,count=0, rem=0;

        preSum.put(0,1);

        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            rem=sum-k;
            count+=preSum.getOrDefault(rem,0);
            preSum.put( sum,preSum.getOrDefault(sum,0)+1);
         }
     return count;
}
}