class Solution {
    public int hammingWeight(int n) 
    {
            int count=0;
        for(int i=0;i<32; i++)
        {
            if((n&1)>0) count++;
            n>>=1;

        }

        return count;

        
    }
}