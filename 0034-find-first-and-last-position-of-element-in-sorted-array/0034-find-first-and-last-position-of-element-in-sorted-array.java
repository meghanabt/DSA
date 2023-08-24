class Solution {

    public int[] searchRange(int[] nums, int target) {

        if(nums.length==0) return new int[]{-1,-1};

        int[] ans=new int[2];
        ans[0]=search(nums, target, true);
        ans[1]=search(nums,target, false);

        return ans;

        
    }

    public int search(int[] nums, int target, boolean flag)
    {

        int low=0,high=nums.length-1,mid=0,ans=-1;

        while(low<=high)
        {
            mid=(low+high)/2;

            if(nums[mid]==target){
                 ans=mid;
                if(flag)
                {
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else if(nums[mid]>target) high=mid-1;
            else low=mid+1;
        }

        return ans;

    }
}