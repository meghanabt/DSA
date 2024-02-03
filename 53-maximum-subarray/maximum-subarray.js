/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {

    var maxI= Number.MIN_SAFE_INTEGER
    var sum=0

    for(let i=0;i<nums.length;i++)
    {
        sum+=nums[i]
        if(sum>maxI)
        {
            maxI=sum
        }

        if(sum<0) sum=0
    }

   

     return maxI

    
};