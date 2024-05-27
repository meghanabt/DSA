class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        int maxLength=1;

        if(nums.length==0)
        {
            return 0;
        }

        for(int i=0;i <nums.length; ++i)
        {
            set.add(nums[i]);
        }

       
        for(int it: set)
        {
            if(!set.contains(it-1))
            {
                int x= it;
                int cnt=1;

                while(set.contains(x+1))
                {
                    x=x+1;
                    cnt=cnt+1;

                }
                maxLength= Math.max(maxLength, cnt);

            }
        }

        return maxLength;
        
    }
}