/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number}
 */
var search = function(nums, target) {
   
    var high = nums.length-1
    var low=0
    var mid

    while(low<=high)
    {
        mid=Math.floor((low+high)/2)
        console.log(mid,low,high)

        if(nums[mid]==target)  
        {
            return mid

        }

        else if(nums[mid]>target)  {high=mid-1}

        else {low=mid+1}

    }

    return -1;
    
};