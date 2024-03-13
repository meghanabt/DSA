class Solution {

    List<List<Integer>> ans= new ArrayList<>();
   
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        
        Arrays.sort(candidates);
        formulate(candidates,0,target,ans,new ArrayList<>());
        return ans;
    }

    public void formulate(int[] candidates, int index, int target,List<List<Integer>> ans,List<Integer> list)
    {
       
            if(target==0)
            {
                ans.add(new ArrayList<>(list) );
                return;
            }

            for(int i=index;i<candidates.length;i++)
            {
                if(i>index  && candidates[i]==candidates[i-1]) continue;
                if(candidates[i]>target) break;

                list.add(candidates[i]);
                formulate(candidates,i+1,target-candidates[i],ans,list);
                list.remove(list.size()-1);
               
        
            }

          

 

        
    }
}