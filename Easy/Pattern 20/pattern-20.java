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
        int count=n-1;
    for(int i=0;i<((2*n)-1);i++){
            if(i<n)
            {
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*(count));j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            count--;
           
            }
            else
            {
                count++;
            for(int j=0;j<i-(2*count)-1;j++){
                System.out.print("*");
            }
            for(int j=0;j<=((2*(i-n))+1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<i-(2*count)-1;j++){
                System.out.print("*");
            }
                
            }
            
            System.out.println(" ");
        }
    }
}