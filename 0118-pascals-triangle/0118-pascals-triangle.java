class Solution {
    public static List<List<Integer>> generate(int numRows) {

        ArrayList<List<Integer>> ans = new ArrayList<>();
       
        for(int i=1;i<=numRows;i++)
        {
            ans.add(insertRow(i));
        }
        return ans;
        
    }

    public static List<Integer> insertRow(int n)
    {
         ArrayList<Integer> temp = new ArrayList<>();
         int ans=1;
         temp.add(ans);
         
        for(int col=1;col<n;col++)
        {
            ans=ans*(n-col);
            ans=ans/col;
            temp.add(ans);
        }

        return temp;
    }
}