//{ Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while (t-- > 0) {

            String s;
            s = br.readLine();

            Solution obj = new Solution();
            String res = obj.removeOuter(s);

            System.out.println(res);
        }
    }
}

// } Driver Code Ends


class Solution {
    public static String removeOuter(String s) {
        // code here
        Stack<Character> stack= new Stack<Character>();
        StringBuilder result= new StringBuilder();
        int index=0;
        for(int i=0;i<s.length();i++){
            char a=s.charAt(i);
            if(a=='('){
                stack.push('(');
            }
            else if(a==')'){
                stack.pop();
                if(stack.isEmpty()){
                result=result.append(s,index+1,i);
                index=i+1;
                
            }
            }
        
        }
        return result.toString();
    }
}
