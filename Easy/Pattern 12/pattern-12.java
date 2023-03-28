//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Main {
    // Driver code
    public static void main(String[] args) throws Exception {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            Solution obj = new Solution();
            obj.printTriangle(n);
        }
    }
}
// } Driver Code Ends


class Solution {

    void printTriangle(int n) {
        int distance=0;
        for(int i=1;i<=n;i++){
             distance = (2*n)-(2*i);  
             //System.out.print("distance "+distance);

            for(int j=1;j<=2*n;j++){
                    if(j<=i){
                    System.out.print(j+" ");
                    }
                else{
                   if(distance>0)
                   {
                    System.out.print("  ");
                    distance--;
                   }
                   else{
                    System.out.print(((2*n)-j+1)+" ");

                   }
                }
                
            }
System.out.println();       
}
    }
}