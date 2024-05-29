class Solution {
    public int maxArea(int[] height) {

        int left=0, right=height.length-1;
        int maxArea= Integer.MIN_VALUE;

        while(left<right)
        {
            int width= right- left;
            int heigh= Math.min(height[left], height[right]);
            maxArea=Math.max(maxArea, width *heigh);

            if(height[left]> height[right]) right--;
            else left++;
            
        }

        return maxArea;
        
    }
}