class Solution {
    public int countSubstrings(String s) {

        if(s.length()==1) return 1;

        int res=0;

        for(int i=0; i<s.length(); i++)
        {
              res+= totalSubstrings(s, i, i);
              res+= totalSubstrings(s, i, i+1);

        }

        return res;
        
    }

    public int totalSubstrings(String s, int start, int end)
    {
        int count=0;
        while(start>=0 && end< s.length() && s.charAt(start--)== s.charAt(end++))
        {
            count++;
        }

        return count++;
    }
}