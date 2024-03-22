class Solution {
    public static void rotate(int[] nums, int k) {

        k=k%nums.length;

        reverse(nums,0, nums.length-k-1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1);

        
    }

    public static  void reverse(int[] nums, int start, int end)
    {

        while(start<=end)
        {
            int temp=nums[end];
            nums[end]=nums[start];
            nums[start]=temp;
            start++;
            end--;
        }

    }
}