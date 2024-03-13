class Solution {

   

    public List<List<Integer>> combinationSum(int[] candidates, int target) 
    {
         List<List<Integer>> ans= new ArrayList<>();
        generateList(candidates,ans, target, 0, new ArrayList < > ());
        return ans;


        
    }

    public void generateList(int [] candidates,List<List<Integer>> ans, int target, int index,List<Integer> list)
    {
        if(index==candidates.length)
        {
            if(target==0)
            {
                ans.add(new ArrayList<>(list));
            }
            return;
        }
        if (candidates[index] <= target) {
            list.add(candidates[index]);
            generateList(candidates,ans, target-candidates[index],index, list);
            list.remove(list.size() - 1);
        }
         generateList(candidates,ans, target,index+1, list);
}
}