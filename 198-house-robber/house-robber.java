class Solution {
    public int rob(int[] nums) {

        if(nums.length==2) return Math.max(nums[0], nums[1]);
        int prev=nums[0];
        int prev2= 0;

        for(int i=1;i<nums.length;i++)
        {
            int pick=nums[i];

            if(i>1) pick+=prev2;

            int nonPick= prev;

            int cur_i=Math.max(pick, nonPick);
            
            prev2=prev;
            prev=cur_i;

        }

        return prev;
        
    }
}