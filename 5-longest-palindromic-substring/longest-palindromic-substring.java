class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<=1) return s;
        int start=0, end=0;
        int maxLen=1;

        for(int i=0; i<s.length();i++)
        {
            int oddLength=middleChecker(s, i,i);
            int evenLength= middleChecker(s, i, i+1);

            int len=Math.max(oddLength, evenLength);
            if(len >end-start)
            {
                maxLen=len;
                start= i-((len-1)/2);
                end = i + (len)/2;
            }

        }

        return s.substring(start, end+1);

    }

    public int middleChecker(String s, int left, int right)
    {

        while(left>=0 && right<s.length() && s.charAt(left)==s.charAt(right))
        {
            left--;
            right++;
        }

        return right-left-1;
       

        

    }
}