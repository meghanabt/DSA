class Solution {

    List<List<Integer>> ans= new ArrayList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        // Arrays.sort(nums);
        // subsequence(0,new ArrayList<>(),nums);
        // return ans;

        Arrays.sort(nums); 
        List<List<Integer>> ansList = new ArrayList<>(); 
        findSubsets(0, nums, new ArrayList<>(), ansList); 
        return ansList; 
    }

     public static void findSubsets(int ind, int[] nums, List<Integer> ds, List<List<Integer>> ansList) {
        ansList.add(new ArrayList<>(ds)); 
        for(int i = ind;i<nums.length;i++) {
            if(i!=ind && nums[i] == nums[i-1]) continue; 
            ds.add(nums[i]); 
            findSubsets(i+1, nums, ds, ansList); 
            ds.remove(ds.size() - 1);
        }
        
    }

    // public void subsequence(int index, List<Integer> del, int[] nums)
    // {
    //     ans.add(new ArrayList<>(del));
    //     for(int i=index;i<nums.length;i++)
    //     {
    //         if(i!=index && nums[i]==nums[i-1]) continue;
    //         del.add(nums[i]);
    //         subsequence(index+1, del,nums);
    //         del.remove(del.size()-1);
    //     }
    // }


}