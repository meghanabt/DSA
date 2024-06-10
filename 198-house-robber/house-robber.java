class Solution {
    public int rob(int[] nums) {

        int[] dp= new int[nums.length+1];
        Arrays.fill(dp, -1);
         dp[0]=nums[0];
         

         for(int i=1; i<nums.length; i++)
         {
            int pick= nums[i];
            if(i>1)
             pick+=dp[i-2];
            int notpick = dp[i-1];

            dp[i]=Math.max(pick, notpick);
         }
         return dp[nums.length-1];
         
      //  return checkrobbing(nums.length-1,nums, dp);
        
    }

    public int checkrobbing(int index, int[] nums, int[] dp)
    {
        if(index==0) return nums[index];
        if(index<0) return 0;

        if(dp[index]!=-1) return dp[index];

        int left= nums[index]+checkrobbing(index-2, nums, dp);
        int right= 0+ checkrobbing(index-1, nums, dp);

        return dp[index]=Math.max(left, right);
        
    }
}