//{ Driver Code Starts
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.*;


public class Driver {
    
    public static void main(String[] args)throws IOException {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while(tc-->0)
        {
            String s1 = br.readLine();
            String s2 = br.readLine();
            
            Solution obj = new Solution();
            
            boolean a = obj.areIsomorphic(s1,s2);
            if(a)
            System.out.println(1);
            else
            System.out.println(0);
        }
    }
    
}

// } Driver Code Ends


class Solution
{
    //Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String str1,String str2)
    {
        HashMap<Character,Character> map= new HashMap<>();
        Set<Character> set= new HashSet<>();
        char s1,s2=' ';
           //check if length of str1 and str2 same or not
        
            if(str1.length()!=str2.length())
            {
                return false;
            }
            
        
        for(int i=0;i<str1.length();i++)
        {
            s1=str1.charAt(i);
            s2=str2.charAt(i);
            
                if(map.containsKey(s1))
                {
                    if(map.get(s1)!=s2)
                    {
                        return false;
                    }
                }

            
                else 
                {
                    if(set.contains(s2))
                    return false;
                    
                    map.put(s1,s2);
                    set.add(s2);
                }
        }
        
        return true;
    }
}