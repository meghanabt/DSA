class Solution {
    public List<String> generateParenthesis(int n) {

        List<String> ans= new ArrayList<>();
        solve(n*2, 0,0,"",ans);
        return ans;
        
    }

    public static void solve (int total, int open, int close, String curr, List<String> ans)
    {

        if(curr.length()== total)
        {
            ans.add(curr);
            return;
        }

        if(open<total/2)
        {
                 solve(total, open+1, close, curr+"(",ans );
        }
         if(close<open)
        {
             solve(total, open, close+1, curr+")",ans );
        }

    }
}