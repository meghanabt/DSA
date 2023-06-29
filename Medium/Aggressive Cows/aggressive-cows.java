//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t;
        t = sc.nextInt();
        while (t-- > 0) {

            int n;
            n = sc.nextInt();

            int k;
            k = sc.nextInt();

            int[] v = new int[n];
            for (int i = 0; i < n; i++) v[i] = sc.nextInt();

            Solution obj = new Solution();
            int res = obj.solve(n, k, v);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


// User function Template for Java
class Solution {
    
    public static boolean isPossible(int[] stalls, int minDistance, int cows)
    {
        int initialPosition=stalls[0];
        cows--;
        
        for(int i=1;i<stalls.length;i++)
        {
            if(stalls[i]-initialPosition >= minDistance)
            {
                cows--;
                initialPosition=stalls[i];
                if(cows==0) return true;
                
            }
        }
        
        return false;
        
    }
    public static int solve(int n, int k, int[] stalls) {
        
        //Sort the positions of the stalls
        Arrays.sort(stalls);

        int low=1,high=stalls[n-1]-stalls[0],mid=0;

        while(low<=high)
        {
            mid=(low+high)/2;
            
            if(isPossible(stalls,mid,k)){
                low=mid+1;
            }
            else{
                high= mid-1;
            }
        }
        
        return high;
        
    }
}