class Solution {
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        if(nums.length==2) return Math.max(nums[0], nums[1]);

    int[] arr1= new int[nums.length-1];
    int[] arr2= new int[nums.length-1];

    for(int i=0;i<nums.length; i++)
    {
        if(i!=nums.length-1) arr1[i]=nums[i];
        if(i!=0) arr2[i-1]= nums[i];
    }

    int result= Math.max(computeMax(arr1), computeMax(arr2));

    return result;

    }

    public int computeMax(int[] nums)
    {
        int prev2=0;
        int prev=nums[0];


        for(int i=1; i<nums.length; i++)
        {
            int pick= nums[i];

            if(i>1) pick+=prev2;

            int nonpick=prev;

            int curr= Math.max(pick, nonpick);

            prev2=prev;
            prev=curr;
        }

        return prev;



    }
}