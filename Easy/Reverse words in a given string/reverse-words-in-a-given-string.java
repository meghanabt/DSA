//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            String s = sc.next();
            Solution obj = new Solution();
            System.out.println(obj.reverseWords(s));
            t--;
        }
    }
}

// } Driver Code Ends



class Solution 
{
    //Function to reverse words in a given string.
    String reverseWords(String S)
    {
         int startIndex= S.length()-1;
         String s= new String();
         
         for(int i=startIndex; i>=0;i--)
         {
             if(S.charAt(i)=='.')
             {
                 s+=S.substring(i+1,startIndex+1);
                 s+=".";
                 startIndex=i-1;
             }
             else if(i==0)
             {
                 s+=S.substring(0,startIndex+1);
                 
             }
             else{
                 continue;
             }
         }
         
         return s;
        // code here 
    }
}